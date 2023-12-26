package day7.Main;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import day7.entities.Resturant;
import day7.utils.HibernateUtils;

public class HibernateAnnotaionMain {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session= factory.openSession();
		Resturant  rst= new Resturant(123,"china","chinise" , 23);
		Transaction tx=session.beginTransaction();
		session.save(rst);
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Restaurant created");
		

	}

}
