package day3;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages={"day3","day3_test"})
@Configuration

public class SpringAppConfig {
	
	//Configuring a bean of type:java.util.list
	@Bean
	public List<String> countries(){
		List<String> countryList=Arrays.asList("Bharart","bhutan" ,"Nepal");
		return countryList;
		
	}

}
