package day3;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import day3_test.FourthTest;
import day3_test.another.AnotherFourthTest;



public class PureAnnotationBasedConfigurationMain {

	public static void main(String[] args) {
	    Class<SpringAppConfig> config=SpringAppConfig.class;
	    AnnotationConfigApplicationContext an= new AnnotationConfigApplicationContext(config);
	    
	    //Loading a bean of type:FirstBean
	   FirstTest fbean= an.getBean(FirstTest.class);
	   
	   //Loading a bean of type:SecondBean
	   SecondTest bbean= an.getBean(SecondTest.class);
	   
	   //Loading a bean of type:thirdBean
	  Object obj=an.getBean("third");
	  ThirdTest ttest=(ThirdTest)obj;
	  ttest.doTest();	  
	  fbean.doTest();
	   bbean.doTest();
	  
	   
	   System.out.println("----------------Accesing FOurth Bean---------------------");
	   FourthTest ftest=an.getBean(FourthTest.class);
	   ftest.doTest();
	   
	   System.out.println("---------------- Accesing Another FOurth Bean---------------------"); 
	   day3_test.another.AnotherFourthTest Aftest=an.getBean(AnotherFourthTest.class);
	   Aftest.doTest();
	   
	   System.out.println("---------------- Accesing bean of type java.util.list---------------------"); 
	   obj=an.getBean("countries");
	   List<String> listOfCountries=(List<String>)obj;
	   System.out.println(listOfCountries);
	   

	}

}
