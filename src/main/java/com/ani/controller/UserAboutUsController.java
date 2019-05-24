package com.ani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserAboutUsController {

	public UserAboutUsController() {
		System.out.println("UserAboutUsController is loading");
		}
		@RequestMapping("/userAboutUs")
		public String aboutUsPage()
		{
			return "userAboutUs";
		}
		
			@RequestMapping("/userHomePage")
			public String homePage()
			{
				return "userHomePage";
			}
			
}
