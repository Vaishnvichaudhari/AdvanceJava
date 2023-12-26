package day8;

import java.io.File;
import java.io.IOException;

//Demonstrating the use of File class
public class FileClassMain {

	public static void main(String[] args) {
		String dirPath = "./src/day8/zoo";
		File currentDirectory = new File(dirPath); 
		if(currentDirectory.exists()) { 
			//System.out.println("Directory found");
			
			String filePath = dirPath + "/animals.txt";
			File currentFile = new File(filePath);
			
			if(currentFile.exists())
				System.out.println("File found");
			else
				System.out.println("File not found, creating the same");
				try {
					currentFile.createNewFile();//Create a file
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		else {
			System.out.println("Directory not found, creating the same");
			currentDirectory.mkdir();//Makes a directory
		}

	}

}



