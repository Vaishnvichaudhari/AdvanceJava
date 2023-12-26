package day2.Programmatic;

import org.springframework.stereotype.Component;

@Component //Marks this class as a managed component
public class Test {
	
	public Test() {
		System.out.println("Test Initiated");
	}
	public void doTest() {
		System.out.println("Text Works...");
	}

}
