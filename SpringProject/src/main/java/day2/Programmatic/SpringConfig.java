package day2.Programmatic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import day1.GreetingService;
import day1.HelloService;
import day1.WelcomeService;
import day2.UserGreetingService;
import day2.UserService;

@Configuration   //Marks this class an configuration Unit
@ComponentScan
public class SpringConfig {
	
	@Bean  //Marks this method as a bean declaration or registration method
	public GreetingService helloBean() {
		GreetingService service=new HelloService();  //<bean class="day7.HelloService" id="helloBean/>
		return service;
		
	}
	@Bean
	public GreetingService welcomeBean() {
		GreetingService service =new WelcomeService();//<bean class="WelcomeService"/>
		return service;
	}
	
	@Bean("myUserBean") //Registers a bean of type UserService against as an ID:myBean
	public GreetingService userBean() {
		GreetingService service= new UserService();
		return service;
		
	}
	
	@Bean
	@Scope
	@Lazy
	public GreetingService userGreetingBean() {
		GreetingService service = new UserGreetingService("Welcome","Jackkey",23);
		return service;
	}

}
