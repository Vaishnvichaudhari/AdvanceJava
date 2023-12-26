package day3;

import org.springframework.stereotype.Component;

@Component
public class SecondTest {
   public SecondTest() {
	   System.out.println("Second Test insiatiated");
   }
   
   public void doTest() {
	   System.out.println("Second Test Works");
   }
}
