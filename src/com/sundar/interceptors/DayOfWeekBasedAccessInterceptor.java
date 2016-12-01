package com.sundar.interceptors;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception{
		
		
		
		//if this method returns true then - application will further handle the request
		//if this method returns false then - application will not further handle the request
		
		
		Calendar cal = Calendar.getInstance();
		
		int dayOfWeek = cal.get(cal.DAY_OF_WEEK);
		
		if(dayOfWeek == 1){ //1 == means sunday
			
			response.getWriter().write("The Website is closed on sunday, please try accessing it " + 
					"on any other week day!");
			
			return false;
		}
		
		return true;
		
	}
	
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception{
		
		//This method would be called after spring MVC executes the request handler method for the request
		System.out.println("HandlerIntercepterAdapter : Spring MVC called postHandle for " + 
																				request.getRequestURI().toString() ) ;
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)throws Exception{
		
		//This method would be called after the response object is produced by the view for the request
		System.out.println("HandlerIntercepterAdapter : Spring MVC called afterCompletion for " + 
				request.getRequestURI().toString() ) ;
	}
	
}
