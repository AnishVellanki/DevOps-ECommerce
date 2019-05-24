package com.ani.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ani.Daoimpl.LoginRegisterDaoImpl;
import com.ani.model.User;

@Controller
public class LoginRegisterController {

	@Autowired
	LoginRegisterDaoImpl loginRegisterDaoImpl;
	public LoginRegisterController() {
	System.out.println("LoginRegisterController is loading");
	}

	@RequestMapping("/register")
	public ModelAndView getRegister()
	{
		ModelAndView modelAndView=new ModelAndView("userRegister");
	
				modelAndView.addObject("reg",new User());
		return modelAndView;
	}
	
	@RequestMapping(value="/addregdata",method=RequestMethod.POST)
	public String AddUserData(@ModelAttribute("reg") User user)
	{
		loginRegisterDaoImpl.saveRegisterData(user);
       
    	
	return null;	
	}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~LoginController~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	@RequestMapping("/login")
public ModelAndView goToLoginForm()
{
		ModelAndView modelAndView=new ModelAndView("userLogin");
		User user=new User();
		modelAndView.addObject("login",user);
		return modelAndView;
}
	@RequestMapping(value="/gologin",method=RequestMethod.POST)
	public ModelAndView recieveLoginDetails(@ModelAttribute("login") User user)
	{
System.out.println("from login " +user);		
		boolean b=loginRegisterDaoImpl.checkLogin(user);
				if(b==true)
				{
					ModelAndView modelAndView=new ModelAndView("LoginSuccesful");
					return modelAndView; 
				}
				else
				{
					ModelAndView modelAndView=new ModelAndView("userLogin");
					modelAndView.addObject("WrongUser","wrongusername/password");
					return modelAndView;
				}
		
	}
	
}
