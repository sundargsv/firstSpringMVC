package com.sundar.hellocontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/*import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.mvc.AbstractController;*/

/*public class HelloController extends AbstractController{

	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage", "Hi Sundar, welcome");
		
		return modelandview;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/
/*@PathVariable Map<String, String> pathVars
 * String name = pathVars.get("userName");
 * */
@Controller
@RequestMapping("/greet")
public class HelloController{
	
	//The below is the requestHandler Methods
	@RequestMapping("/welcome")
	public ModelAndView helloWorld(){
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "hello world");
		return model;
	}
	@RequestMapping("/hi/{userName}/{empId}")
	public ModelAndView hi(@PathVariable ("userName") String name, @PathVariable ("empId") int eid){
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "hi : "+name+" and your Employee Id is " +eid);
		return model;
	}
}


