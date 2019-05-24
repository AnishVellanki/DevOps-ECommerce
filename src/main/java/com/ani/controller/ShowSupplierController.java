package com.ani.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ani.Daoimpl.CategoryDaoImpl;
import com.ani.Daoimpl.SupplierDaoImpl;
import com.ani.Daoimpl.TestSessionFactory;
import com.ani.model.Category;
import com.ani.model.Supplier;

	@Controller
	public class ShowSupplierController {
		@Autowired
		TestSessionFactory ts;
		
		@Autowired
		SupplierDaoImpl supplierDaoImpl;
		
		public ShowSupplierController() {
			System.out.println("ShowSupplierController is loading ");
				}
				@RequestMapping("/dbc")
			public 	ModelAndView m1()
				{
					System.out.println("--------------------test0");
					
					List<Supplier> list=null;
					list=supplierDaoImpl.retrieveSupplierData();
					System.out.println("--------------------test1");
					/*for(Category c:list)
					{
						System.out.println("---"+c.getCategoryId());
						System.out.println(c.getCategoryName());
						System.out.println(c.getCategoryDescription());
					}*/
					
					System.out.println("--------------------test2");
					ModelAndView modelAndView=new ModelAndView("showSupplier");
					modelAndView.addObject("supList",list);
					
					return modelAndView;
				}
				@RequestMapping("/delSup")
				public ModelAndView deleteCategoryData(@RequestParam("supId") int supplierId)
				{
					System.out.println(supplierId);
					Supplier supplier=supplierDaoImpl.getSupplier(supplierId);
					supplierDaoImpl.deleteSupplier(supplier);
					ModelAndView modelAndView=new ModelAndView("showSupplier");
					List<Supplier> list=supplierDaoImpl.retrieveSupplierData();
					modelAndView.addObject("supList",list);
					return modelAndView ;
				}
	@RequestMapping("/editSup")
	public ModelAndView editCategoryData(@RequestParam("supId") int supplierId)
	{
		Supplier supplier=supplierDaoImpl.getSupplier(supplierId);
		ModelAndView modelAndView=new ModelAndView("addSupplier");
		modelAndView.addObject("button","Update Supplier");
		modelAndView.addObject("addSup",supplier);
		modelAndView.addObject("form","Update Supplier");
		return modelAndView;
	}


	}


