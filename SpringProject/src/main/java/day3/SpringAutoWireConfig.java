package day3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SpringAutoWireConfig {
	
	//Registering the Bean type musicsystem
	@Bean
	public MusicSystem getMusicSystem() {
		MusicSystem ms= new MusicSystem("Sony" ,"Dobly");
		return ms;
	}
	
	@Primary
	@Bean
	public MusicSystem getMusicSystem1() {
		MusicSystem ms1= new MusicSystem("JBL" ,"EUuuu");
		return ms1;
	}
	
	//Registering a bean id type Engine
	@Bean
	public Engine getEngine() {
		Engine e= new Engine("petrol" ,"1200CC");
		return e;
		
	}
	
	//Registering a bean id type Car
	@Bean("myCar")
		public Car getCar() {
		 Car c= new Car();
		 c.setMake("Hyundai");
		 c.setModel("I 20");
		 c.setPrice(1800000);
		return c;
		 	
		 
		}

}
