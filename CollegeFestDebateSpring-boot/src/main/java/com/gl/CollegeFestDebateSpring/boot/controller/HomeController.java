package com.gl.CollegeFestDebateSpring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//this is the root controller page
@Controller
public class HomeController {
	@RequestMapping("/")
	public String home()
	{
		return "home-page";
	}
	
}
