package com.ani.Daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ani.model.Product;

@Component
public class ProductDaoImpl {
	
	@Autowired
	SessionFactory factory;


	public void saveProduct(Product product)
	{
		
	Session session= factory.openSession();
	if(product.getProductId()==0)
	{
		System.out.println("---"+product.getProductId());
	int id=(int)(Math.random()*10000);
	product.setProductId(id);
	}
	session.saveOrUpdate(product);
	Transaction transaction=session.beginTransaction();
	transaction.commit();
	session.close();

	}
	
	public List<Product> retrieveProductsData()
	{
		Session session=factory.openSession();
		Query query=session.createQuery("from Product");
		List<Product> productsList=query.list();
		for(Product p:productsList)
		{
			System.out.println(p.getProductId());
			System.out.println(p.getProductName());
			System.out.println(p.getProductDescription());
			System.out.println(p.getProductPrice());
			System.out.println(p.getProductCategory());
			System.out.println(p.getProductSupplier());
		
		}
		return productsList;
		
	}
	public void deleteProduct(Product product)
	{
	Session session=factory.openSession();
	session.delete(product);
	Transaction transaction=session.beginTransaction();
	transaction.commit();
	session.close();
	}
	public Product getProduct(int productId) {
		Session session= factory.openSession();	
		Product product=session.get(Product.class, productId);
		session.close();
		return product;
	}
}
