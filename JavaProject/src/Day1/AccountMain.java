package Day1;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Account a1 = new Account();
	      a1.name = "Vaishnavi";
	      a1.setPassword("abcd");
	      a1.setEmail("vaishnavi96@gmail.com");
	      
	     System.out.println("Name is:" + a1.name );
	     System.out.println("Password is:" + a1.getPassword() );
	     System.out.println("EmailId is:" + a1.getEmail());

	}

}
