package com.ani.Daoimpl;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ani.model.Cart;
import com.ani.model.Product;

@Component
public class AddToCartDaoImpl {

	@Autowired
	SessionFactory factory;
	
	
	public void saveCart(Cart cart)
	{
		Session session=factory.openSession();
		System.out.println("printing id"+cart.getProductId());
		session.save(cart);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		session.close();
	}
	
	public List<Cart> retrieveCartData()
	{
		Session session=factory.openSession();
		Query query=session.createQuery("from Cart");
		List<Cart> cartList=query.list();
		for(Cart c:cartList)
		{
			System.out.println(c.getProductId());
			System.out.println(c.getProductName());
	
			System.out.println(c.getProductPrice());
		System.out.println(c.getProductSupplier());
		
		}
		return cartList;

		}
	
}

