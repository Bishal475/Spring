package com.wp.handson4.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MovieController {
	
	@RequestMapping("/Top")
	public ModelAndView getTopMovies() {
		ModelAndView mv = new ModelAndView("result");
		List<String> movieName = new ArrayList<String>();
		movieName.add("Shawshank Redemption");
		movieName.add("God Father");
		movieName.add("Dark Knight");
		movieName.add("Avatar");
		movieName.add("Avengers");
		movieName.add("Spider-Man");
		movieName.add("Venom");
		movieName.add("Black Panther");
		movieName.add("Iron Man");
		movieName.add("Inception");
		
		mv.addObject("listMovies",movieName);
		return mv;
	}
}
