package com.ani.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ani.Daoimpl.SupplierDaoImpl;
import com.ani.Daoimpl.TestSessionFactory;
import com.ani.model.Category;
import com.ani.model.Supplier;
@Controller
public class AddSupplierController
{
	@Autowired
	TestSessionFactory ts;
	
	@Autowired
	SupplierDaoImpl supplierDaoImpl;
	
	public AddSupplierController()
	{
		
System.out.println("AddSupplierController is loading ");
	}
	@RequestMapping("/cbc")
	public ModelAndView goToSupplierForm()
    {
        ModelAndView  mv=new ModelAndView("addSupplier");
        
        mv.addObject("addSup",new Supplier());
        mv.addObject("button","Add Supplier");
        mv.addObject("form","Add Supplier");
        return  mv;
    }
	
	@RequestMapping(value="/addSupplier",method=RequestMethod.POST)
    public String recieveSupplierFormData(@ModelAttribute ("addSup") Supplier sp)
    {
//TestSessionFactory testSF=new TestSessionFactory();
		//ts.TestingSessionFactory();
		System.out.println(sp.getSupplierName());
        System.out.println(sp.getSupplierDescription());
        supplierDaoImpl.saveSupplier(sp);
        return "home";
    }
 
	
}

