package com.ani.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ani.Daoimpl.AddToCartDaoImpl;
import com.ani.Daoimpl.ProductDaoImpl;
import com.ani.model.Cart;
import com.ani.model.Product;

@Controller
public class AddToCartController {
	
	 @Autowired
     AddToCartDaoImpl cartDaoImpl;
	 
	 @Autowired
     ProductDaoImpl productDaoImpl;
	 
	 
	 
	public AddToCartController() {
	System.out.println("AddToCartController is loading");	// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/addtocart123")
    public ModelAndView getCart(@RequestParam("proId") int productId)
       {
		
		ModelAndView modelAndView=new ModelAndView("addCartSnipp");
           System.out.println("Product Id```="+productId);      
           Product product=productDaoImpl.getProduct(productId);
           System.out.println("********"+product);
           Cart cart=new Cart();
           cart.setCartId((int)(Math.random()*10000));
           cart.setProductId(product.getProductId());
           cart.setProductName(product.getProductName());
           cart.setProductPrice(product.getProductPrice());
           cart.setProductSupplier(product.getProductSupplier());
           cart.setQuantity(1);
        cartDaoImpl.saveCart(cart);
        
        modelAndView.addObject("cart",cart);
           return modelAndView;
       }
@RequestMapping("/addToCart")
public String saveQuantity(HttpServletRequest request)
{
	int proId=Integer.parseInt(request.getParameter("proId"));
	int qty=Integer.parseInt(request.getParameter("qty"));
	System.out.println("Cart productId"+proId);
	System.out.println("Cart Quantity"+qty);
	Product product=productDaoImpl.getProduct(proId);
    System.out.println("********"+product);
    Cart cart=new Cart();
    cart.setCartId((int)(Math.random()*10000));
    cart.setProductId(product.getProductId());
    cart.setProductName(product.getProductName());
    cart.setProductPrice(product.getProductPrice());
    cart.setTotalPrice((cart.getProductPrice())*(qty));
    cart.setProductSupplier(product.getProductSupplier());
    cart.setQuantity(qty);
 cartDaoImpl.saveCart(cart);

	return "userHomePage";
}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ShowCartController~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
@RequestMapping("/cart")
public ModelAndView recieveProductsData()
{
		List<Cart> list=cartDaoImpl.retrieveCartData();
		ModelAndView modelAndView=new ModelAndView("userViewCart");
		modelAndView.addObject("cartList",list);
	return modelAndView;
}
}
