package day6;

public class MultipleExceptionHandlerMain {

		public static void main(String[] args) {
			// This program accepts 2 numbers as Command Line Arguments and prints their sum
			try {
				int x = Integer.parseInt(args[0]);
				int y = Integer.parseInt(args[1]);
				int result = x + y;
				System.out.println(result);
			}
			catch(ArrayIndexOutOfBoundsException ex) {
				//Reference 'ex' refers to an object of type ArrayIndexOutOfBoundsException, which is created by JRE
				System.out.println("Enter at least 2 numbers");
			}
			catch(ArithmeticException ex)
			{
				System.out.println("Enter 2 no as non-zero");
			}

		}


}
