package com.ani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactUsController {

	public ContactUsController() {
	System.out.println("ContactUsController is loading");
	}
	@RequestMapping("/contact")
	public String aboutUsPAge()
	{
		return "contactUs";
	}
}
