package day11;

public class GreetingMain {

	public static void main(String[] args) {
		 Greeting firstGreeting =()->"Hello";
		 Greeting secondGreeting =()->{
			 String message="Welcome";
			 return message;
		 };
		 
		 String g1= firstGreeting.sayGreeting();
		 String g2= secondGreeting.sayGreeting();
		 
		 System.out.println(g1);
		 System.out.println(g2);

	}

}
