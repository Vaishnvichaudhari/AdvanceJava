package day8;

import java.io.RandomAccessFile;

//Demonstrating the use of RandomAccessFile class
public class RandomAccessFileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "./src/day8/zoo/animals.txt";
		try (
				RandomAccessFile rf = new RandomAccessFile(filePath, "r")//Opening this file for reading
			){
			long fileSize = rf.length();
			long midPosition = fileSize / 2;
			//Placing the file pointer directly at the mid position
			rf.seek(midPosition);
			while(true) {
				int data = rf.read();
				if(data == -1)
					break;
				System.out.print((char)data);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		

	}

}
