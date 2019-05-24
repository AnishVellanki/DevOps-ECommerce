package com.ani.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ani.Daoimpl.CategoryDaoImpl;
import com.ani.Daoimpl.ProductDaoImpl;
import com.ani.Daoimpl.TestSessionFactory;
import com.ani.model.Category;
@Controller
public class ShowCategoryController {
	@Autowired
	TestSessionFactory ts;
	
	@Autowired
	CategoryDaoImpl categoryDaoImpl;
	
	@Autowired
	ProductDaoImpl productDaoImpl;
	
	public ShowCategoryController() {
		System.out.println("ShowCategoryController is loading ");
			}
			@RequestMapping("/bbc")
		public 	ModelAndView m1()
			{
				System.out.println("--------------------test0");
				
				List<Category> list=null;
				list=categoryDaoImpl.retrieveCategoryData();
				System.out.println("--------------------test1");
				/*for(Category c:list)
				{
					System.out.println("---"+c.getCategoryId());
					System.out.println(c.getCategoryName());
					System.out.println(c.getCategoryDescription());
				}*/
				
				System.out.println("--------------------test2");
				ModelAndView modelAndView=new ModelAndView("showCategory");
				modelAndView.addObject("catList",list);
				
				return modelAndView;
			}
			@RequestMapping("/del")
			public ModelAndView deleteCategoryData(@RequestParam("catId") int categoryId)
			{
				System.out.println(categoryId);
				Category category=categoryDaoImpl.getCategory(categoryId);
				categoryDaoImpl.deleteCategory(category);
				ModelAndView modelAndView=new ModelAndView("showCategory");
				List<Category> list=categoryDaoImpl.retrieveCategoryData();
				modelAndView.addObject("catList",list);
				return modelAndView ;
			}
@RequestMapping("/edit")
public ModelAndView editCategoryData(@RequestParam("catId") int categoryId)
{
	Category category=categoryDaoImpl.getCategory(categoryId);
	ModelAndView modelAndView=new ModelAndView("category");
	modelAndView.addObject("button","Update Category");
	modelAndView.addObject("cat",category);
	modelAndView.addObject("form","Update Category");
	return modelAndView;
}


}
