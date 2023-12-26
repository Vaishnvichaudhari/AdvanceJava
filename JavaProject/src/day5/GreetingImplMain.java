package day5;

public class GreetingImplMain {

public static void main(String[] args) {
		// TODO Auto-generated method stub
      GreetingImpl grImpl = new GreetingImpl();//Building GreetingImpl object using a default service: HelloGreeting
	  grImpl.showGreeting();
	  
	  GreetingService grServices = new WelcomeGreeting();
	  grImpl.setService(grServices);
	  grImpl.showGreeting();
	  

  }

}
