package day8;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Program to read the contents of some file and display them
public class BufferedInputStreamMain {

	public static void main(String[] args) {
		String filePath =  "./src/day8/Names.txt";
		
		try (
				FileInputStream fin = new FileInputStream(filePath);
				BufferedInputStream bin = new BufferedInputStream(fin);//Wraps FileInputStream: fin
				) {
			//Reading the contents until End of File (EOF) is encountered.
			while(true) {
				int data = bin.read();//Reads one character from the buffer
				if(data == -1)//Checking for EOF position
					break;
				char ch = (char)data;
				System.out.print(ch);
			}
		} catch (FileNotFoundException e) {
			System.out.println("The file does not exist.");
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
