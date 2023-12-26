package toDo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ToDo9Serialization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of courses you want to enter");
		int num = sc.nextInt();
		Course[] coursearray = new Course[num];
		for(int i=0;i<num;i++) {
			System.out.println("Enter course Id:");
			int id = sc.nextInt();
			
			System.out.println("Enter course name:");
			String name = sc.next();
			
			System.out.println("Enter course fees:");
			int fee = sc.nextInt(); 
			
			coursearray[i] = new Course(id,name,fee);
		}
		//Serialization
		String filePath = "./src/toDo1/course_data.txt";
		try (
			FileOutputStream fo = new FileOutputStream(filePath);
				ObjectOutputStream out = new ObjectOutputStream(fo);
				){
			
				out.writeObject(coursearray);
			
			System.out.println("successful");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}