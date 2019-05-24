package com.ani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

	public HomePageController() {
		System.out.println("HomePageController is loading");
	}
	@RequestMapping("/home")
	public String goToHome()
	{
		return "home";
	}
}
