package day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadMain {
	
	public static void main(String[] args) {
	  // String filePath ="Names.txt";
	 String filePath = "./src/day8/Names.txt";
	   
	   FileInputStream fin = null;
	   try {
		   fin = new FileInputStream(filePath);
		 //Reading the contents until End of File (EOF) is encountered.
		   
		   while(true) {
			   int data =  fin.read();//Reads one character and returns its value.
		   
	       if(data==-1) //checking for EOF Position
			   break;
		   char ch =(char)data;
		   System.out.print(ch);
		   }
		   
		  }catch(FileNotFoundException e) {
			  System.out.println("File Does not exist");
			  
		  }catch(IOException e) {
			  e.printStackTrace();
			  
		  }finally {
			  try {
				  fin.close();
			  }catch(IOException e){
				  e.printStackTrace();;
			  }
		  }
	
	}
}
	   
	
	   

	


