package kodlamaIO;

public class InstructorManager extends User{
	int instructorId;
	
	public InstructorManager(){
		
	}
	public InstructorManager(int instructorId, String firstName, String lastName, String eMail, String password) {
		this.instructorId = instructorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = password;
	}
	
	public void enterenceInfo() {
		System.out.println(instructorId + " " + eMail);
	}
	

	public void editFirstName(String firstName) {
		
		System.out.println("Previous name: " + this.firstName);
		this.firstName = firstName;
		System.out.println("Instructor first name changed with: " + this.firstName);
	}
	
	public void editLastName(String lastName) {
		
		System.out.println("Previous Instructor last name: " + this.lastName);
		this.lastName = lastName;
		System.out.println("Instructor last name changed with : "+ this.lastName);
	}
	
	public void editPassword(String password) {
		
		System.out.println("Previous Instructor password: " + this.password);
		this.password = password;
		System.out.println("Instructor password changed with : "+ this.password);
	}
}
