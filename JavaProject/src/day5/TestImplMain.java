package day5;

public class TestImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface ti = new TestImpl();
		ti.doTest();
		
		//Invoking a static method using the format: InterfaceName.methodName()
		TestInterface.performTest();

	}

}
