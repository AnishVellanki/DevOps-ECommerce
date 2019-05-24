package com.ani.Daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ani.model.Supplier;
@Component
public class SupplierDaoImpl {
@Autowired
SessionFactory factory;
public void saveSupplier(Supplier supplier)
{
	
Session session= factory.openSession();
if(supplier.getSupplierId()==0)
{
	System.out.println("---"+supplier.getSupplierId());
int id=(int)(Math.random()*10000);
supplier.setSupplierId(id);
}
session.saveOrUpdate(supplier);
Transaction transaction=session.beginTransaction();
transaction.commit();
session.close();

}
	
public List<Supplier> retrieveSupplierData()
{
	Session session=factory.openSession();
	Query query=session.createQuery("from Supplier");
	List<Supplier> supplierlist=query.list();
	for(Supplier sp:supplierlist)
	{
		System.out.println(sp.getSupplierDescription());
		System.out.println(sp.getSupplierName());
	}
	session.close();
return  supplierlist;
}

public void deleteSupplier(Supplier supplier)
	{
		Session session=factory.openSession();
		//Category category=session.get(Category.class, categoryId);
		//System.out.println("~~~~~~"+category);
		//System.out.println("~~~~~~~"+category.getCategoryId());
		//System.out.println("~~~~~~~"+category.getCategoryDescription());
		
		session.delete(supplier);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		session.close();
	}
	public Supplier getSupplier(int supplierId) {
		Session session= factory.openSession();	
		Supplier supplier=session.get(Supplier.class, supplierId);
		session.close();
		return supplier;
	}
}
