package toDo1;

public class Avgduartion  extends CourseDataCalculator  {
	    @Override
	    public float doCalculation(CMS[] CourseList) {
	        if ( CourseList.length == 0) {
	            return 0.0f;
	        }

	        float totalD = 0;
	        for (CMS course : CourseList) {
	            totalD += course.getDuration();
	        }

	        return totalD / CourseList.length;
	    }
	}

