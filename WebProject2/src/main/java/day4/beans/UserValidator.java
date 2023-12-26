package day4.beans;


//This class is used to person validation on user Object
public class UserValidator {
	public static boolean isValid(User currentUser) {
		//The code for validation
		boolean success=false;
		String currentUserId= currentUser.getUserId();
		String currentPassword=currentUser.getPassword();
		 if(currentUserId.equals("admin") && currentPassword.equals("phoenix123"))
			 success=true;
		 return success;
		 
		
	}

}
