package com.movies.repositary;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.movies.model.Movies;

@Repository
public class MovieRepositary {
	
	
	Movies m;
	
	public void utilize(Movies m1) {
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Movies.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		sess.save(m1);
		tr.commit();
		sess.close();
	}
	public String updateMovie(int id,String name,int price) {
		
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Movies.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		

		Query<Movies> query=sess.createSQLQuery("update Movies set mName=name where mId=id");
		
		return "Updated Successfully";
		
	}
	
	public String deleteMovie() {
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Movies.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		

		Query<Movies> query=sess.createSQLQuery("delete from Movies where mId=10");
		
		return "Deleted Successfully";
		

	}
	
	public List<Movies> getMovie() {
		
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Movies.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		

		Query<Movies> query=sess.createSQLQuery("select * from Movies");
		List<Movies> list=query.list();
		
		return list;
		
		

	}
	public String saveMovie(int id,String name,int price) {
		
		m=new Movies();
		m.setmId(id);
		m.setmName(name);
		m.setmPrice(price);
		
//		utilize(m);
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Movies.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		sess.save(m);
		tr.commit();
		sess.close();

		
		return "Data saved successfully";
	}

}
