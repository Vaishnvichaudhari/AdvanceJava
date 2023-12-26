package toDoJDBC;

//import java.util.Objects;

public class CourseEntity {


	private int  courseID;
	private String tittle;
	private int duration;
	private String provider;
	private int fees;
	


	public CourseEntity(int CourseID,String tittle ,int duration, String provider, int fees) {
		this.courseID=CourseID;
		this.tittle=tittle;
		this.duration=duration;
		this.provider=provider;
		this.fees=fees;
		
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	@Override
	public String toString() {
		return "CourseEntity [courseID=" + courseID + ", tittle=" + tittle + ", duration=" + duration + ", provider="
				+ provider + ", fees=" + fees + "]";
	}
}
