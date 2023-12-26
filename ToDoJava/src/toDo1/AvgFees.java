package toDo1;

public class AvgFees  extends CourseDataCalculator{
	    @Override
	    public float doCalculation(CMS[] CourseList) {
	        if ( CourseList.length == 0) {
	            return 0.0f;
	        }

	        float totalFees = 0;
	        for (CMS course : CourseList) {
	            totalFees += course.getFees();
	        }

	        return totalFees / CourseList.length;
	    }
	}

