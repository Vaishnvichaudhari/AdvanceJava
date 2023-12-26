package toDo1;


//TODO7
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CourseInfoFileMain {

	public static void main(String[] args) {
		//String file1 = args[0];
		//String file2 = args[1];
//		String filePath = "./src/toDo1/" + file1;
//		String filename = "./src/toDo1/" + file2;
		String filePath = "./src/toDo1/course_info.txt";
		String filename = "./src/toDo1/CopiedData.txt";
		String temp = "";
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(filePath);
			while(true) {
				int data = fin.read();
				if(data == -1) {
					break;
				}
				char ch = (char)data;
				temp = temp + ch;
			}
			try(FileOutputStream fout = new FileOutputStream(filename, true)){
				byte[] course_byte = temp.getBytes();
				fout.write(course_byte);
				System.out.println("Data is written on file");
			}  catch (Exception e) {
				
				e.printStackTrace();
			}
		} catch(FileNotFoundException e) {
			System.out.println("The file does not exist.");
		} catch(IOException e) {
			e.getStackTrace();
		}
		
	}


}