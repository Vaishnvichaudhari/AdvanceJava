package day3;

import org.springframework.stereotype.Component;

@Component
public class FirstTest {
   public FirstTest() {
	   System.out.println("First Test insiatiated");
   }
   
   public void doTest() {
	   System.out.println("First Test Works");
   }
}
