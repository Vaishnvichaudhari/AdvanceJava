package toDo1;

public class TotalCountofCourse implements CourseInfoProcessor {
    @Override
    public float processCourseInfo(CMS[] courses, CMS CourseInfo) {
        int count = 0;
        
        for (CMS course : courses) {
        	if (course.getProvider()== CourseInfo.getProvider() && course.getDuration() ==CourseInfo.getDuration()) {
        	   count++;
           }
        }
        return count;
    }
}
