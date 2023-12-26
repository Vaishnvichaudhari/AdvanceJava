package day5;

public class OuterClass {
	private int x=10;
	private static int y=20;
	
	
	//Static Inner Class
	public static class StaticInnerClass{
		public void print() {
			//System.out.println(x);Error: Since 'x' is Non-Static field which is not accessible in Static Inner Class
		   System.out.println(y);
		}
	}
	
	//NestedClass
	public class NestedClass{
		public void print() {
			System.out.println(x);
			System.out.println(y);
		}
	}
	public void print() {
		class Message { //This is a class local to the method: print()
			String getMessage(String name, String greeting) {
				return greeting + " " + name;
			}
		}	
		Message msg = new Message();
		String msgOutput = msg.getMessage("James", "Welcome");
		System.out.println(msgOutput);
	}
	

}
