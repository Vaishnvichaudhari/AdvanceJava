package day3;

import org.springframework.stereotype.Component;

@Component("third") //configured this component with an ID:third
public class ThirdTest {
   public ThirdTest() {
	   System.out.println("Third Test insiatiated");
   }
   
   public void doTest() {
	   System.out.println("Third Test Works");
   }
}
