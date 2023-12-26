package day2.Programmatic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import day1.GreetingService;

public class JavaBasedConfigurationMain {

	public static void main(String[] args) {
		 AnnotationConfigApplicationContext annoCtx= new AnnotationConfigApplicationContext();
		 
		 //Registering the configuration unit:SpringCofig
		 Class<SpringConfig> configurationUnit = SpringConfig.class;
		 annoCtx.register(configurationUnit);
		 
		 //Refreshing the COntext
		 annoCtx.refresh();
		 
		 
		Object obj= annoCtx.getBean("helloBean");
		GreetingService gs=(GreetingService)obj;
		String reply=gs.sayGreeting();
		System.out.println(reply);
		System.out.println("--------------------------------------");
		 
		 obj= annoCtx.getBean("welcomeBean");
		 gs=(GreetingService)obj;
	    reply=gs.sayGreeting();
		System.out.println(reply);
		System.out.println("--------------------------------------");
		
		 obj= annoCtx.getBean("myUserBean");
		 gs=(GreetingService)obj;
	    reply=gs.sayGreeting();
		System.out.println(reply);
		System.out.println("--------------------------------------");
		
		 Object o1= annoCtx.getBean("greetingBean");
		 Object o2= annoCtx.getBean("greetingBean");
		 System.out.println(o1==o2);
			
		
		

	}
	
	

}
