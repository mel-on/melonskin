package com.melonskin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping("/indexTest.html")
	public ModelAndView test() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}

}
