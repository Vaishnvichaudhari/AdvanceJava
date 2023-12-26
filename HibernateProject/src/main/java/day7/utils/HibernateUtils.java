package day7.utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import day7.entities.Resturant;

public class HibernateUtils {
	//This is a utility class for obtaining SessionFactory.
	public static SessionFactory getSessionFactory() {
	System.out.println("configuring Hibernate ");
		Configuration hibernateConfig = new Configuration();
		//hibernateConfig = hibernateConfig.configure();
		
		//Specifying Entity class
		Class<Resturant> entityClass=Resturant.class;
		hibernateConfig.addAnnotatedClass(entityClass);	
		
		
		//Specifying the properties
		Properties hibernateProps= new Properties();
		System.out.println("Driver Config");
		hibernateProps.put("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver");
		hibernateProps.put("hibernate.connection.url","jdbc:mysql://localhost:3306/cdac_nov_23?useSSL=false");
		hibernateProps.put("hibernate.connection.username","root");
		hibernateProps.put("hibernate.connection.password","Vaish@123");
		
		hibernateProps.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		hibernateProps.put("hibernate.show_sql", "true");
		hibernateProps.put("hibernate.hbm2ddl.auto", "update");
		
		hibernateConfig.setProperties(hibernateProps);
		
		SessionFactory hibernateFactory = hibernateConfig.buildSessionFactory();
		System.out.println("configu complete");
		return hibernateFactory;
	}

}
