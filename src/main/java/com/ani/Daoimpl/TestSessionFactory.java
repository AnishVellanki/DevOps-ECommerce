package com.ani.Daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestSessionFactory {
@Autowired
SessionFactory sessionFactory;
public void TestingSessionFactory()
{
	System.out.println(sessionFactory);
}
}
