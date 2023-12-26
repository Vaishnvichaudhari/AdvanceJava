package toDo1;

import java.io.Serializable;
import java.util.Objects;

public class Course implements Serializable{
	private int courseId;
	private String courseTitle;
	
	private int courseFees;
	
	

     public Course (int courseId, String courseTitle,  int courseFees) {
		this.courseId = courseId;
		this.courseTitle = courseTitle;
		
		this.courseFees = courseFees;
		
	}


	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	
	

	public int getCourseFees() {
		return courseFees;
	}

	public void setCourseFees(int courseFees) {
		this.courseFees = courseFees;
	}


	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseTitle=" + courseTitle + ", courseFees=" + courseFees + "]";
	}
	
	
	


	

}