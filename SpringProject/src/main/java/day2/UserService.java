package day2;

import day1.GreetingService;

public class UserService implements GreetingService {

	public  UserService() {
		System.out.println("Constructor");
	}
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello from Me!";
	}

}
