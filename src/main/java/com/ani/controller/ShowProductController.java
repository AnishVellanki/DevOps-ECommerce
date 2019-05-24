package com.ani.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ani.Daoimpl.CategoryDaoImpl;
import com.ani.Daoimpl.ProductDaoImpl;
import com.ani.Daoimpl.SupplierDaoImpl;
import com.ani.model.Category;
import com.ani.model.Product;
import com.ani.model.Supplier;


@Controller
public class ShowProductController {
	
	@Autowired
	ProductDaoImpl productDaoImpl;
	
	@Autowired
	CategoryDaoImpl categoryDaoImpl;

	@Autowired
	SupplierDaoImpl supplierDaoImpl;

	public ShowProductController()
	{
		System.out.println("ShowProductController is loading");
	}
	@RequestMapping("/fbc")
public ModelAndView recieveProductsData()
{
		List<Product> list=productDaoImpl.retrieveProductsData();
		ModelAndView modelAndView=new ModelAndView("showProduct");
		modelAndView.addObject("proList",list);
	return modelAndView;
}
	@RequestMapping("/delPro")
	public ModelAndView deleteProductData(@RequestParam("proId") int productId)
	{
		Product product= productDaoImpl.getProduct(productId);
		productDaoImpl.deleteProduct(product);
		ModelAndView modelAndView=new ModelAndView("showProduct");
		List<Product> list=productDaoImpl.retrieveProductsData();
		modelAndView.addObject("proList",list);
		return modelAndView ;
		
	}
	
	
	@RequestMapping("/editPro")
	public ModelAndView editProductsData(@RequestParam("proId") int productId)
	{
		Product product= productDaoImpl.getProduct(productId);
		ModelAndView modelAndView=new ModelAndView("addProduct");
		List<Category> list=null;
		list=categoryDaoImpl.retrieveCategoryData();
		modelAndView.addObject("catList",list);
		List<Supplier> suplist=null;
		suplist=supplierDaoImpl.retrieveSupplierData();
		modelAndView.addObject("supList",suplist);
	
		modelAndView.addObject("button","Update Product");
		modelAndView.addObject("addPro",product);
		modelAndView.addObject("form","Update Product");
		return modelAndView;
		
	}
}
