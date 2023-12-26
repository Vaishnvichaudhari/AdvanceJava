package day2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanloadingMain {

	public static void main(String[] args) {
	 ApplicationContext ctx= new ClassPathXmlApplicationContext("spring-config.xml");
	 
	 ctx.getBean("myBean3"); //Object begin created and constructor get called
		

	}

}
