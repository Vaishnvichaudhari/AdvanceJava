package toDo1;

//TODO6
public class CourseCollection {
	private static CMS[] availableCourses =new CMS[5];
	static {
		 availableCourses [0]= new CMS(101, "Core Java", 100, "Udemy", 5500);
		 availableCourses [1]= new CMS(102, "Adv Java", 100,"Udemy",  8500);
		 availableCourses[2]= new CMS(103, "Angular", 60,"Edureka",  7500);
		 availableCourses [3]= new CMS(104, "Angular",  75,"Coursera" , 8000);
		 availableCourses [4]= new CMS(105, "Spring", 40,"Udemy",  10500);
    				
		}  


public static  void  printCourseNames(String provider) throws ProviderNotFoundException{
	int position =-1;
	int size= availableCourses.length;
	for( int i=0; i<size; i++) {
		String currentName = availableCourses[i].getProvider();
		if(currentName.equals(provider)) {
			position =i;
			System.out.println(availableCourses[i].getTittle());
		}
		
	}
	if(position == -1) {//If name is not found then throw the exception:proviserNotFoundException
		String error = "Invalid";
		ProviderNotFoundException px = new ProviderNotFoundException(error, provider);
		throw px;			
	}
	return;
	

	  
	}
}
   



