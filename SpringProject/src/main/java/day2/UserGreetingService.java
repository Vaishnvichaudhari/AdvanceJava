package day2;

import day1.GreetingService;

public class UserGreetingService implements GreetingService {
	private String userName;
	private String  greetingMessage;
	private int userAge;
	
	public UserGreetingService() {
		
	}

	public UserGreetingService(String userName, String greetingMessage, int userAge) {
		super();
		this.userName = userName;
		this.greetingMessage = greetingMessage;
		this.userAge = userAge;
	}

	@Override
	public String sayGreeting() {
		
		return null;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGreetingMessage() {
		return greetingMessage;
	}

	public void setGreetingMessage(String greetingMessage) {
		this.greetingMessage = greetingMessage;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
	
	@Override
	public String toString() {
		return "UserGreetingService [userName=" + userName + ", greetingMessage=" + greetingMessage + ", userAge="
				+ userAge + "]";
	}

}
