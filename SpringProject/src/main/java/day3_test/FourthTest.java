package day3_test;

import org.springframework.stereotype.Component;

@Component //configured this component with an ID:third
public class FourthTest {
   public FourthTest() {
	   System.out.println("Fourth Test insiatiated");
   }
   
   public void doTest() {
	   System.out.println("Fourth Test Works");
   }
}
