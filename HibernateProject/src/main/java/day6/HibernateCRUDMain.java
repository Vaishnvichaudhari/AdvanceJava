package day6;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import day5.beans.Resturant;

public class HibernateCRUDMain {
	private static void createnewRestaurant() {
		Configuration hibernateConfig = new Configuration();
		hibernateConfig = hibernateConfig.configure();
		SessionFactory hibernateFactory = hibernateConfig.buildSessionFactory();
		Session hibernateSession = hibernateFactory.openSession();
		Resturant rst = new Resturant(105, "Heaven", "FoRAll", 5);
		Transaction hibernateTransaction = hibernateSession.beginTransaction();
		hibernateSession.save(rst);
		hibernateTransaction.commit();
		hibernateSession.close();
		hibernateFactory.close();
		System.out.println("Restaurant created successfully.");
	}
	private static void ShowOne() {
		Configuration hibernateConfig=new  Configuration();
		hibernateConfig=hibernateConfig.configure();
		SessionFactory hibernateFactory=hibernateConfig.buildSessionFactory();
		Session session=hibernateFactory.openSession();
		Class<Resturant> c1=Resturant.class;
		Serializable id=101;
		Resturant foundR= session.load(c1, id);
		System.out.println(foundR);
		session.close();
		hibernateFactory.close();
	
	}
	private static void Update() {
		Configuration hibernateConfig = new Configuration();
		hibernateConfig= hibernateConfig.configure();
		SessionFactory hibernateFactory=hibernateConfig.buildSessionFactory();
		Session session = hibernateFactory.openSession();
		Class<Resturant> c1= Resturant.class;
		Serializable id=104;
		Resturant foundR=session.load(c1, id);
		Transaction tx= session.beginTransaction();
		foundR.setCuisine("Oriental");
		tx.commit();
		session.close();
		hibernateFactory.close();
		System.out.println("Updated Succesfully!");
	
	}
	private static void Delete() {
		Configuration hibernateConfig= new Configuration();
		hibernateConfig = hibernateConfig.configure();
		SessionFactory Factory =hibernateConfig.buildSessionFactory();
		Session session= Factory.openSession();
		Class<Resturant> c1= Resturant.class;
		Serializable id=105;
		Resturant foundR=session.load(c1, id);
		Transaction tx=session.beginTransaction();
	      session.delete(foundR);
	      tx.commit();
	      session.close();
	      Factory.close();
	      System.out.println("Record Delete Sucessfully.");
		
	}
	

	public static void main(String[] args) {
		//createnewRestaurant();
		//ShowOne();
		//Update();
		Delete();

	}

}
