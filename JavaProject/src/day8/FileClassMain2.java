package day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileClassMain2 {

	public static void main(String[] args) {
	   String filePath ="./src/day8/zoo/animal.txt";
	   File currentFile= new File(filePath);
	   if(currentFile.exists()) {
		   try(FileInputStream fin = new FileInputStream(currentFile)){
			   long fileSize= currentFile.length();
			   int size =(int)fileSize;
			   byte data[] = new byte[size];  //Declaring a byte array as per the file size
			   fin.read(data);  //Transfers the contents of file into byte array
			   
			   String fileData= new String(data);
			   System.out.println(fileData);
		   } 
		   catch (Exception ex ) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
	
	   }
	   
	   }else
		   System.out.println("File does not exist");
	}

}
