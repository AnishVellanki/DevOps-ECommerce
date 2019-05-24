package com.ani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UserContactUsController {

	public UserContactUsController() {
		System.out.println("USerContactUsController is loading");
		}
		@RequestMapping("/userContactUs")
		public String aboutUsPAge()
		{
			return "userContactUs";
		}
}

	

