
package com.ani.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ani.Daoimpl.AddToCartDaoImpl;
import com.ani.Daoimpl.CategoryDaoImpl;
import com.ani.Daoimpl.ProductDaoImpl;
import com.ani.Daoimpl.SupplierDaoImpl;

import com.ani.model.Product;


    @Controller
    public class userProductController {
    	
        @Autowired
        SupplierDaoImpl supplierDaoImpl;
        
        @Autowired
        CategoryDaoImpl categoryDaoImpl;
        
        @Autowired
        AddToCartDaoImpl addtocartDaoImpl;
        
        @Autowired
        ProductDaoImpl productDaoImpl;
        public userProductController() {
        System.out.println("userProductController is loading");    
        }
        @RequestMapping("/showproducts")
        public ModelAndView goToShowProduct()
        {
            ModelAndView modelandview=new ModelAndView("userGrid");
               List<Product> listProduct = productDaoImpl.retrieveProductsData();
              
               //List<Supplier> listSupplier = supplierDaoImpl.retrieveSupplierData();
                   
                  
                   //modelandview.addObject("supList", listSupplier);
                  
            
              modelandview.addObject("proList", listProduct);
            return modelandview;
        }
        @RequestMapping("/viewDetails")
        public ModelAndView ViewProduct(@RequestParam("proId") int productId)
           {
               System.out.println("from product controller Product Id="+productId);
              
               Product product=productDaoImpl.getProduct(productId);
        
        System.out.println("~~~~~~~~~~~"+product);
               ModelAndView modelandview=new ModelAndView("userViewSinglePro");
              
              modelandview.addObject("pr",product);
            
            
               return modelandview;
           }
    }



