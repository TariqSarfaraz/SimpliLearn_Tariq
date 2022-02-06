package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InitHibernate
{

	public static SessionFactory getCon() 
	{

			SessionFactory factory = new Configuration().configure("cfg.xml").buildSessionFactory();
			
			return factory;
	}
}