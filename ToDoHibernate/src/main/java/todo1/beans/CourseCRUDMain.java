package todo1.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class CourseCRUDMain {
	private static void createCreated() {
		Configuration hibernateConfig = new Configuration();
		hibernateConfig = hibernateConfig.configure();
		SessionFactory hibernateFactory = hibernateConfig.buildSessionFactory();
		Session hibernateSession = hibernateFactory.openSession();
		CMS cm = new CMS(1,"OS",20,"Udemy",10000);
		Transaction hibernateTransaction = hibernateSession.beginTransaction();
		hibernateSession.save(cm);
		hibernateTransaction.commit();
		hibernateSession.close();
		hibernateFactory.close();
		System.out.println("Course Created.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   createCreated();

	}

}
