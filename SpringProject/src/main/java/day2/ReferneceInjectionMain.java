package day2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferneceInjectionMain {

	public static void main(String[] args) {
  
		ApplicationContext ap=  new ClassPathXmlApplicationContext("spring-config.xml");
		Object cobj= ap.getBean("myCustomer");
		System.out.println(cobj);

	}

}
