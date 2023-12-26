package CMS.bean;

public class CMS {
	private int  courseID;
	private String tittle;
	private int duration;
	private String provider;
	private int fees;
	


	public CMS(int CourseID,String tittle ,int duration, String provider, int fees) {
		this.courseID=courseID;
		this.tittle=tittle;
		this.duration=duration;
		this.provider=provider;
		this.fees=fees;
		
	}


	public CMS(String tittle) {
		// TODO Auto-generated constructor stub
		this.tittle=tittle;
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
	public void Display() {
		System.out.println("CourseID:"+ courseID +" ," +"Tittle:" + tittle +" ," +"Duration:" + duration+" ," +"Provider:"+ provider +" ," +"Fees:" + fees);
		
	}




	
}