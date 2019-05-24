package com.ani.controller;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ani.Daoimpl.CategoryDaoImpl;
import com.ani.Daoimpl.ProductDaoImpl;
import com.ani.Daoimpl.SupplierDaoImpl;
import com.ani.model.Category;
import com.ani.model.Product;
import com.ani.model.Supplier;


@Controller
public class AddProductController {
@Autowired
ProductDaoImpl productDaoImpl;

@Autowired
CategoryDaoImpl categoryDaoImpl;

@Autowired
SupplierDaoImpl supplierDaoImpl;

	public AddProductController() {
		System.out.println("AddProductController is loading");
	}
	@RequestMapping("/ebc")
	public ModelAndView AddProductData()
	{
		ModelAndView modelAndView=new ModelAndView("addProduct");
		List<Category> list=null;
		list=categoryDaoImpl.retrieveCategoryData();
		modelAndView.addObject("catList",list);
		List<Supplier> suplist=null;
		suplist=supplierDaoImpl.retrieveSupplierData();
		modelAndView.addObject("supList",suplist);
		
		Product product=new Product();
		int id=(int)(Math.random()*10000);
		product.setProductId(id);
		
		modelAndView.addObject("addPro",product);
		modelAndView.addObject("button","Add Product");
        //modelAndView.addObject("form","Add Product");
		return modelAndView;
	}
	@RequestMapping(value="/addProduct",method=RequestMethod.POST)
public String recieveProductFormData(@ModelAttribute("addPro") Product product)
{
		MultipartFile imageFile=product.getProductImage();
		System.out.println("~~~~~~~~~~~~~~~~~imagefile"+imageFile);
		BufferedOutputStream bos=null;
		try {
			
			
				byte byteArray[];
				byteArray = imageFile.getBytes();
				FileOutputStream fos=new FileOutputStream("D:/proj/E-commerce/src/main/webapp/resources/product-images/"+product.getProductId()+".jpg");
				bos=new BufferedOutputStream(fos);
				bos.write(byteArray);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	finally
	{
		
		try {
			bos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		productDaoImpl.saveProduct(product);
	return "home";
}

}
