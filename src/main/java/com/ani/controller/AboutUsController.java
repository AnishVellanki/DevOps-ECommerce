package com.ani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutUsController {

	public AboutUsController() {
	System.out.println("AboutUsController is loading");
	}
	@RequestMapping("/about")
	public String aboutUsPage()
	{
		return "aboutUs";
	}
}
