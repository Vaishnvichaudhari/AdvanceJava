package toDo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ToDo9DeserializationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String filePath = "course_data.txt";
//		
//		
//				try (
//						FileInputStream fr = new FileInputStream(filePath);
//						ObjectInputStream sin = new ObjectInputStream(fr)	)
//				{
//						Course[] arr = (Course[]) sin.readObject();
//						
//					for(Course cr : arr){
//						System.out.println(cr);
//					}
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} 
//
//
//	}
		
		String filePath="./src/toDo1/course_data.txt";
		try(FileInputStream fis=new FileInputStream(filePath);
			ObjectInputStream ois=new ObjectInputStream(fis))
		{

            Course[] coursearray = (Course[]) ois.readObject();  // Read the array of Course objects from the file

            // Display course details
            System.out.println("Course details:");
            for (Course course : coursearray) {
                System.out.println(course);
            }

//			Object currentObject=ois.readObject();
//			
//			System.out.println(currentObject);
//			Courses curentCourse=(Courses)currentObject;
//			String cC=curentCourse.getName();
//			System.out.println(cC);
//			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}


}
