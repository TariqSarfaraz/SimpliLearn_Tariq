package com.phase2;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil 
{

	public static SessionFactory getFactory() {
	
	SessionFactory factory = new Configuration().configure("cfg.xml").addAnnotatedClass(Learner.class).buildSessionFactory();
	
	return factory;
	}
}
