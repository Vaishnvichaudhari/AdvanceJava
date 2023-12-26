package toDo1;

import java.util.Scanner;

public class CMSMain {

	public static void main(String[] args) {
		//TODO1
//		CMS c1 = new CMS(101, "Java" ,10 , "Udemy" , 10000);
//		CMS c2 = new CMS(102, "C++" ,6 , "Coursea" , 2000);
//		CMS c3 = new CMS(103, "Python" ,3 , "Edureka" , 15000);
//		
//		c1.Display();
//		c2.Display();
//		c3.Display();
//		
//
//		//TODO2
//		System.out.println("Count is:" + c1.Count); //Count of Array
		
		
		
		//TODO3
//		CMS c4 = new CMS(101, "Java" ,10 , "Udemy" , 10000);
//		CMS c5 = new CMS(102, "C++" ,60 , "Coursea" , 2000);
//		CMS c6 = new CMS(103, "Python" ,3 , "Edureka" , 15000);
//		
//		CMS CourseList[]= {c1,c2,c3};
//		printShortDurationCorseNames(CourseList);
//		
		
		//TODO4
//		CMS c7 = new CMS(101, "Java" ,10 , "Udemy" , 10000);
//		CMS c8 = new CMS(102, "C++" ,60 , "Coursea" , 2000);
//		CMS c9 = new CMS(103, "Python" ,3 , "Edureka" , 15000);
//		CMS CourseList[]= {c1,c2,c3};
//		
//		  CourseDataCalculator Avgduration = new Avgduartion();
//	      CourseDataCalculator AvgFees = new AvgFees();
//
//	      float averageDuration = Avgduration.doCalculation(CourseList);
//	      float averageFees = AvgFees.doCalculation(CourseList);
//
//	      System.out.println("Avg. Duration: " + averageDuration + " hours");
//	      System.out.println("Avg. Fees: " + averageFees);
		
		
		//TODO5
//		CMS c1= new CMS(101, "Core Java",100, "Udemy",  5500);
//    	CMS c2= new CMS(102, "Adv Java", 100,"Udemy",  8500);
//    	CMS c3= new CMS(103, "Angular", 60,"Edureka",  7500);
//    	CMS c4= new CMS(104, "Angular",  75,"Coursera" , 8000);
//    	CMS c5= new CMS(105, "Spring", 40,"Udemy",  10500);
//    
    					
//		
//    		CMS CourseInfo[]= {c1,c2,c3 ,c4,c5};
//    		
//    		TotalCountofCourse t1 = new TotalCountofCourse ();
//    		System.out.println("CourseCount: " +t1.processCourseInfo(CourseInfo, c1));
//    		
//    		AvgFeesofCourse avg= new AvgFeesofCourse();
//    		System.out.println("Avg Fess: " +avg.processCourseInfo(CourseInfo, c1));
    		
//    		
//    	//TODO6
//    	try {
//    		CourseCollection.printCourseNames("Udemy");
//    	}
//    	catch( ProviderNotFoundException px) {
//    		System.out.println(px.getMessage());
//    	}
    	
    	
    	//TODO7
    	
    	
    	
    	//TODO10
		Scanner scanner=new Scanner(System.in);

	        while (true) {
	            System.out.println("Menu:");
	            System.out.println("1. Add New Course");
	            System.out.println("2. Find Course");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter ID: " );
	                    int courseId = scanner.nextInt();
	                    System.out.println("Enter Title: ");
	                  //  String courseTitle = scanner.nextLine();
	                    String courseTittle = scanner.next();
	                   // CMS newCourse = new CMS(courseTitle);
	                   
	                    CourseDataCollection.addNewCourse(courseId, courseTittle);
	                    break;

	                case 2:
	                    System.out.print("Enter ID: ");
	                    int Id = scanner.nextInt();
	                   // CourseDataCollection.findCourse(Id);
	                    CMS c1 = CourseDataCollection.findCourse(Id);
	                    if (c1 != null) {
	                    	System.out.println(c1.getTittle());
	                    } else {
	                         System.out.println("Course not found with ID: " + Id);
	                   }
	                    
	                    break;

	                case 3:
	                    System.out.println("Exit");
	                   System.exit(0);

	                default:
	                    System.out.println("Invalid choice!Please enter a valid option.");
	            }
	        }
	    }
	
}
