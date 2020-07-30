package com.wp.handson1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/Hello")
	public ModelAndView getHelloPage() {
		ModelAndView mv = new ModelAndView("HelloPage");
		mv.addObject("msg","Hello World");
		return mv;
	}
}
