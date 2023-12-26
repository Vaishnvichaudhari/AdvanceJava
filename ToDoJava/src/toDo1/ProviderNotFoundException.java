package toDo1;

public class ProviderNotFoundException extends Exception {
     private String provider;
	
	public ProviderNotFoundException(String errorMessage , String provider) {
		super(errorMessage);
		this.provider =provider;
  }
	@Override
	public String getMessage() {
		String Message =super.getMessage();
		String finalMessage = Message +":" + provider;
		return finalMessage;
	}
}