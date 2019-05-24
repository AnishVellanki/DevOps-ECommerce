package com.ani.Daoimpl;

import java.util.List;

import javax.persistence.Id;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ani.model.Category;
@Component
public class CategoryDaoImpl {
@Autowired
SessionFactory factory;


public void saveCategory(Category category)
{
	
Session session= factory.openSession();
if(category.getCategoryId()==0)
{
	System.out.println("---"+category.getCategoryId());
int id=(int)(Math.random()*10000);
category.setCategoryId(id);
}
session.saveOrUpdate(category);
Transaction transaction=session.beginTransaction();
transaction.commit();
session.close();

}
	
public List<Category> retrieveCategoryData()
{
	Session session=factory.openSession();
	Query query=session.createQuery("from Category");
	List<Category> categorylist=query.list();
	for(Category ca:categorylist)
	{
		System.out.println(ca.getCategoryDescription());
		System.out.println(ca.getCategoryName());
	}
	session.close();
return  categorylist;

}
	public void deleteCategory(Category category)
	{
		Session session=factory.openSession();
		//Category category=session.get(Category.class, categoryId);
		//System.out.println("~~~~~~"+category);
		//System.out.println("~~~~~~~"+category.getCategoryId());
		//System.out.println("~~~~~~~"+category.getCategoryDescription());
		
		session.delete(category);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		session.close();
	}
	public Category getCategory(int categoryId) {
		Session session= factory.openSession();	
		Category category=session.get(Category.class, categoryId);
		session.close();
		return category;
	}
}
