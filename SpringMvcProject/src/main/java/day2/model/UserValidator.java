package day2.model;

//This class is used to person validation on user Object
public class UserValidator {
	public static boolean isValid(User currentUser) {
		//The code for validation
		boolean success=false;
		String currentUserId= currentUser.getUserName();
		String currentPassword=currentUser.getPassword();
		 if(currentUserId.equals("admin") && currentPassword.equals("Euu"))
			 success=true;
		 return success;
		 
		
	}

}
