package com.jspiders.repositary;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositary {

	
	public void saveDetails(int id,String name,String email) {
		
		User u1=new User();
		u1.setUserId(id);
		u1.setUserName(name);
		u1.setUserEmail(email);
		
	Configuration cfg=new Configuration().configure().addAnnotatedClass(User.class);
	SessionFactory sf=cfg.buildSessionFactory();
	Session sess=sf.openSession();
	Transaction tr=sess.beginTransaction();
	sess.save(u1);
	tr.commit();
	}
}
