package day4.beans;


//This classs object holds username and Password
public  class User{
	private String userId;
	private String password;
	
	public User() {
		
	}

	public User(String userId, String password) {
		super();
		this.setUserId(userId);
		this.setPassword(password);
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}


