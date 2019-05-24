package com.ani.Daoimpl;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ani.model.User;

@Component
public class LoginRegisterDaoImpl {

	@Autowired
	SessionFactory factory;
	public void saveRegisterData(User user)
	{
		Session session= factory.openSession();
		user.setRole("USER_ROLE");
		user.setEnabled(true);
		session.save(user);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		session.close();

	}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~LoginDaoImpl~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public boolean checkLogin(User user)
	{
		Session session=factory.openSession();
		Query query=session.createQuery("from User where email=:em and password=:pw");
		query.setParameter("em",user.getEmail());
		query.setParameter("pw",user.getPassword());
		System.out.println("after cast");
		User user1=(User)query.uniqueResult();
		System.out.println("after cast");
		if(user1==null)
		{
			return false;
		}
		else
		{
			return true;
		}
	
	}
}
