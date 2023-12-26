package day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSimpleExampleMain {

	public static void main(String[] args) {
		//Building ApplicationContext
		String ConfigPath="./src/main/resources/spring-config.xml";
		ApplicationContext ctx=new FileSystemXmlApplicationContext(ConfigPath);
		
		//Obtaining the object(bean) against its ID
		Object obj=ctx.getBean("myBean2");
		
		//Type Conversion
		GreetingService gs=(GreetingService)obj;
		
		//Invoke the Method
		String reply=gs.sayGreeting();
		System.out.println(reply);

	}

}
