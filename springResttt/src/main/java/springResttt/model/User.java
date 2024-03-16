package springResttt.model;

public class User {

	private String userName;
	private String Email;
	private String Password;

	public String getUserName() {
		return userName;
	}

	public User(String userName, String email, String password) {
		super();
		this.userName = userName;
		Email = email;
		Password = password;
	}

	public User() {
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
}
