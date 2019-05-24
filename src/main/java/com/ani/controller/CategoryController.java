package com.ani.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ani.Daoimpl.CategoryDaoImpl;
import com.ani.Daoimpl.TestSessionFactory;
import com.ani.model.Category;

@Controller
public class CategoryController
{
	@Autowired
	TestSessionFactory ts;
	
	@Autowired
	CategoryDaoImpl categoryDaoImpl;
	
	public CategoryController()
	{
		
System.out.println("CategoryController is loading ");
	}
	@RequestMapping("/abc")
	public ModelAndView goToCategoryForm()
    {
        ModelAndView  mv=new ModelAndView("category");
        
        mv.addObject("cat",new Category());
        mv.addObject("button","Add Category");
        mv.addObject("form","Add Category");
        return  mv;
    }
	
	@RequestMapping(value="/addCategory",method=RequestMethod.POST)
    public String recieveCategoryFormData(@ModelAttribute ("cat") Category ca)
    {
//TestSessionFactory testSF=new TestSessionFactory();
		//ts.TestingSessionFactory();
		System.out.println(ca.getCategoryName());
        System.out.println(ca.getCategoryDescription());
     categoryDaoImpl.saveCategory(ca);
        return "home";
    }
 
	
}
