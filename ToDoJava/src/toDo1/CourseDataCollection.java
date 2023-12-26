package toDo1;


//TODO10
import java.util.HashMap;
import java.util.Map;

public class CourseDataCollection {
    private static Map<Integer, CMS> allAvailableCourses = new HashMap<>();
  static {
    allAvailableCourses.put(1, new CMS("Java Programming"));
    allAvailableCourses.put(2, new CMS("Web Development"));
    allAvailableCourses.put(3, new CMS("C++"));
    }

 

	public static void addNewCourse(int courseID, String newCourse) {
		
        allAvailableCourses.put(courseID,new CMS(newCourse));
        System.out.println("Course Added");
    }

    public static CMS findCourse(int id ) {
       CMS course = allAvailableCourses.get(id);
       
        
		return course;
        
      
    }

//	@Override
//	public String toString() {
//		return "CourseDataCollection []";
//	}
    

}
