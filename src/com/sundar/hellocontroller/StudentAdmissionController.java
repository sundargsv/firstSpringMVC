package com.sundar.hellocontroller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sundar.customEditor.StudentNameEditor;
import com.sundar.models.Student;

@Controller
public class StudentAdmissionController {
	
	@InitBinder
	public void initialBinder(WebDataBinder binder){
		
		//property name from student modal - the below removes studentMobile data from the modal itself
		//binder.setDisallowedFields(new String[] {"studentMobile"});
		//Registering with CustomDateEditor(built-in/ custom property editor class) to customize data binding for property date (studentDOB)
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy****MM****dd");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}
	
	@RequestMapping( value = "/admission", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		ModelAndView model = new ModelAndView("AdmissionForm");
		/*model.addObject("headerMsg", "Dotstudio Internet");*/
		return model;
		
	}
	
	/*@RequestMapping( value = "/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam(value = "studentName", defaultValue = "Mr.XYZ") String name, @RequestParam("studentHobby") String hobby ){
		ModelAndView modal = new ModelAndView("AdmissionSuccess");
		modal.addObject("msg", "Hi "+name+" you are registered with the course & your hobby is "+hobby);
		return modal;
		
	}*/
	/*@RequestMapping( value = "/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam Map<String, String> reqParam , @RequestParam(value="studentId") int sid){
		
		String name = reqParam.get("studentName");
		String hobby = reqParam.get("studentHobby");

		ModelAndView modal = new ModelAndView("AdmissionSuccess");
		modal.addObject("msg", "Hi "+name+" you are registered with the course & verify your details");
		modal.addObject("details1", "Student Id :"+sid);
		modal.addObject("details2", "Hobby :"+hobby);
		
		return modal;
		
	}*/
	
	@ModelAttribute
	public void addingCommonObject(Model model){
		
		model.addAttribute("headerMsg", "Dotstudio Internet");
		model.addAttribute("headerMsg2", "(c) Copyright Reserved 2017");

	}
	
	//@ModelAttribute in method argument
	@RequestMapping( value = "/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student1") Student student1, BindingResult result){
		
		if(result.hasErrors()){
			ModelAndView model = new ModelAndView("AdmissionForm");
			
			return model;
		}
		

		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("msg", "Hi you are registered with the course & verify your details");
		/*model.addObject("headerMsg", "Dotstudio Internet");*/
		
		return model;
		
	}
	
}
