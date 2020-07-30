package com.wp.handson3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MarksController {
	
	@RequestMapping("/add")
	public ModelAndView calculateMarks(@RequestParam("science")int sc,@RequestParam("maths")int mh,@RequestParam("eng")int en) {
		ModelAndView mv = new ModelAndView("total_marks");
		int sum = sc+mh+en;
		mv.addObject("marks",sum);
		return mv; 
	}
}
