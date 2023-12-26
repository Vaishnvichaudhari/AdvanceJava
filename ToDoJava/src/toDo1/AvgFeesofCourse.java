package toDo1;

public class AvgFeesofCourse implements CourseInfoProcessor {
	 int Fess=0;
     int count =0;
	@Override
	public float processCourseInfo(CMS[] courses, CMS CourseInfo) {
		  int sum=0;
		  float avg;
		  
	        for (CMS course: courses) {
	        	if (course.getProvider() ==CourseInfo.getProvider() && course.getDuration() ==CourseInfo.getDuration()) {
	        	count ++;
	        	sum +=course.getFees();
	           }
	        }
	        avg = (float)sum/count;
	        return avg ;
	
	}

}
