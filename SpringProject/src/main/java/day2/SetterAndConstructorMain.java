package day2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day1.GreetingService;

public class SetterAndConstructorMain {

	public static void main(String[] args) {
		ApplicationContext tx= new ClassPathXmlApplicationContext("spring-config.xml");
		Object obj = tx.getBean("myBean6");
		GreetingService gs= (GreetingService)obj;
		String greeting=gs.sayGreeting();
		System.out.println("myBean6 Activated");
		
		
		

	}

}
