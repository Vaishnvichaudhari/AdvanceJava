package CMSUtils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import CMS.bean.CMS;


public class CMSUtils {
  public static SessionFactory getSessionFactory() {
	  System.out.println("Started");
	  Configuration config= new Configuration();
	  Class<CMS> cmsclass= CMS.class;
	  config.addAnnotatedClass(cmsclass);
	  
	  Properties p= new Properties();
	  System.out.println("Driver config");
	  p.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
	  p.put("hibernate.connection.url",  "jdbc:mysql://localhost:3306/cdac_nov_23?useSSL=false");
	  p.put("hibernate.connection.username","root" );
	  p.put("hibernate.connection.password","Vaish@123" );
	  
	  
	  p.put("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect" );
	  p.put("hibernate.show_sql", "true" );
	  p.put("hibernate.hbm2ddl.auto","update" );
	  
	  config.setProperties(p);
	  
	  SessionFactory session=config.buildSessionFactory();
	  System.out.println("Completed");
	  
	return session ;
	  
  }
}
