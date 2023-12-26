package day5;

public class TestImpl implements TestInterface {

	@Override
	public void doTest() {
		// TODO Auto-generated method stub
		doTesting();//Giving a call to the default method
		System.out.println("Test Succeeded");

	}

}
