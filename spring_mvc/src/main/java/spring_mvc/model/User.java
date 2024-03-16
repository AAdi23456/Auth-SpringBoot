package spring_mvc.model;

public class User {

	private String userName;
	private String email;
	private String password;
	

	public String getUserName() {
		return userName;
	}

	public User(String userName, String email, String password) {
		super();
		this.userName = userName;
		email = email;
		password = password;
	}

	public User() {
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		password = password;
	}
}
