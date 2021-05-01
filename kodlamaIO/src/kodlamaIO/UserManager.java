package kodlamaIO;

public class UserManager{  
	private User user;
	
	public UserManager() {
		
	}
	public UserManager(User user) {
		this.user = user;
	}
	
	public void logIn() {
		
		user.enterenceInfo();
		System.out.println(" You've entered succesfully.");
	}
	
	public void editFname() {
		user.editFirstName("Engin");
	}
	
	public void editLname() {
		user.editLastName("Demiroð");
	}
	public void editPword() {
		user.editPassword("123pass34");
	}
	
	
}
