package Day1;

public class EmployeeMain {

	public static void main(String[] args) {
		
	  //Create a object of that class
      Employee emp= new Employee();
       
      //Assigning Values for the Object referred by 'emp'
      emp.employeeId=101;
      emp.employeeName="Vaishnavi";
      emp.employeeSalary=22000.33f;
      
      //Reterving values from Class
      System.out.println("employeeId:" + emp.employeeId);
      System.out.println("employeeName:" + emp.employeeName);
      System.out.println("employeeSalary:" + emp.employeeSalary);
	}

}

