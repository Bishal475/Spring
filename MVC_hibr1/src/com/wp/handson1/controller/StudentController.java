package com.wp.handson1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@Autowired
	private StudentService manager;
	
	@RequestMapping(value = "/", method = RequestMethod.GET) 
	public ModelAndView displayLogin(Model model) { 
		ModelAndView mav = new ModelAndView("index");
        mav.addObject("student", new Student());
        return mav;
	}
	
	@RequestMapping(value="/save" , method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("student") Student stud) {
		manager.save(stud); 
		
		return "redirect:/";
	}
	
	@RequestMapping("/view")
	public ModelAndView getAllStudents() {
		ModelAndView mv = new ModelAndView("display_student");
		List<Student> studs = manager.listAll();
		mv.addObject("listStudent",studs);
		return mv;
	}
}
