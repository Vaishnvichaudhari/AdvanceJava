package day7;

public class CurrentThreadMain {

	public static void main(String[] args) {
		Thread mainThreadref= Thread.currentThread();
		int mainThreadPriority = mainThreadref.getPriority();
		String mainThreadName=mainThreadref.getName();
		
		System.out.println("Main Thread Priority: " + mainThreadPriority);
		System.out.println("Main Tread Name: " + mainThreadName);
		
		//Stopping this main thread
				mainThreadref.stop();
				
				System.out.println("This statement will not get printed");


	}

}
