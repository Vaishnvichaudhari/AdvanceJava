package day8;

import java.io.InputStream;
import java.util.Scanner;

public class UserInputMain {

	public static void main(String[] args) {
		InputStream keyboard = System.in; //Populating an InputStream specific to Input Device: Keyboard
		try(
				Scanner valueScanner = new Scanner(keyboard);
				){
			System.out.println("Enter your details: ");
			System.out.println("Name: ");
			String myName = valueScanner.nextLine();
			System.out.println("Age: ")	;
			int myAge = valueScanner.nextInt();
			System.out.println("Weight (Kg): ");
			float myWeight = valueScanner.nextFloat();
			System.out.println("------------------Your Details: -------------------------");
			System.out.println("Name: " + myName);
			System.out.println("Age: " + myAge + " years");
			System.out.println("Weight: " + myWeight + " Kgs");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
