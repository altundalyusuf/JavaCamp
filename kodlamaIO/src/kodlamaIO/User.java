package kodlamaIO;

public class User {
	String firstName;
	String lastName;
	String eMail;
	String password;
	
	public void enterenceInfo() {
		System.out.println("User enterence: ");
	}
	
	public void editFirstName(String firstName) {
		this.firstName = firstName;
		System.out.println("Changed first name");
	}
	
	public void editLastName(String lastName) {
		this.lastName = lastName;
		System.out.println("Changed last name");
	}
	
	public void editPassword(String password) {
		this.password = password;
		System.out.println("Changed password");
	}
}
