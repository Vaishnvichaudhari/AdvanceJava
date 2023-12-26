package day5;

public interface TestInterface {
	void doTest();
	
	//Defining a 'default' method
	default void doTesting() {
		System.out.println("Doing some testing");
		
	}
	
	//Defining a 'static' method
	static void performTest() {
		System.out.println("Performing some test");
	}
}
