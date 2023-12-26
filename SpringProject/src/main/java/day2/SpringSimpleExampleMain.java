package day2;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import day1.GreetingService;

public class SpringSimpleExampleMain {

	public static void main(String[] args) {
		//Building ApplicationContext
		String ConfigPath="spring-config.xml";
		ApplicationContext ctx=new ClassPathXmlApplicationContext(ConfigPath);
		
		//Obtaining the object(bean) against its ID
		Object obj=ctx.getBean("myBean");
		
		//Type Conversion
		GreetingService gs=(GreetingService)obj;
		
		//Invoke the Method
		String reply=gs.sayGreeting();
		System.out.println(reply);

	}

}
