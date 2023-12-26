package toDoJDBC;

import java.util.Collection;

public class CourseMain {
	private static void ShowAllCourses() {
		DaoInterface<CourseEntity, Integer> idao = new CourseDao();
		Collection<CourseEntity> allcourse= idao.getAll();
		for(CourseEntity c :allcourse )
			System.out.println(c);
	}
	private static void GetOne() {
		DaoInterface<CourseEntity,Integer> idao=new CourseDao();
		CourseEntity ce=idao.getOne(2);
		if(ce!=null) {
			System.out.println(ce);
		}
	}
	private static void CreateCourse() {
		DaoInterface<CourseEntity,Integer>idao=new CourseDao();
		CourseEntity c1= new CourseEntity(1,"JDBC" ,5,"CDAC" ,120000);
		idao.create(c1);
		
		
	}
	

	public static void main(String[] args) {
		//ShowAllCourses();
		//GetOne();
		CreateCourse();

	}

}









