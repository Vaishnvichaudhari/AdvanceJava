package day5;

public class GreetingImpl {
	//This class is used to show the greeting message using a GreetingService
	private GreetingService service;
	
	public GreetingImpl() {
		//Setting the default service: HelloGreeting
       service = new HelloGreeting();
	}


	public GreetingImpl(GreetingService service) {
		this.service = service;
	}

	
	public GreetingService getService() {
		return service;
	}
	

	public void setService(GreetingService service) {
		this.service = service;
	}
	
	public void showGreeting() {
		String message = service.sayGreeting();
		System.out.println(message);
	}


	
}
