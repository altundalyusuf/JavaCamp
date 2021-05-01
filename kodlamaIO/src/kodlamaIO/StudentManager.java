package kodlamaIO;

public class StudentManager extends User {
	int studentId;
	

	public StudentManager()
	{
		
	}
	
	public StudentManager(int studentId, String firstName, String lastName, String eMail, String password) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = password;
	}
	
	public void enterenceInfo() {
		System.out.println(studentId + " " + eMail);
	}
	
	public void editFirstName(String firstName) {
		
		System.out.println("Previous Student first name: " + this.firstName);
		this.firstName = firstName;
		System.out.println("Student first name changed with : "+ this.firstName);
	}
	
	public void editLastName(String lastName) {
		
		System.out.println("Previous Student last name: " + this.lastName);
		this.lastName = lastName;
		System.out.println("Student last name changed with : "+ this.lastName);
	}
	
	public void editPassword(String password) {
		
		System.out.println("Previous Student password: " + this.password);
		this.password = password;
		System.out.println("Student password changed with : "+ this.password);
	}
}
