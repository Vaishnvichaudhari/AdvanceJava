package toDo1;
//TODO3
public class CourseProcessor {
   public static void printShortDurationCorseNames(CMS[] CourseList) {
	for(CMS currentCourse:CourseList) {
		int currentDuration =currentCourse.getDuration();
		String currentName =currentCourse.getTittle();
		if(currentDuration<40) {
			System.out.println(currentName);
		}
	}
 }
}