package kodlamaIO;

public class Main {

	public static void main(String[] args) {
		
		UserManager user = new UserManager(new InstructorManager(3,"Halit","Ziya","instructortest@info.com","instructorpass123"));
		User users[] = new User[] {new StudentManager(23,"Debbie","frasni","omniwman124@gmail.com","markviltrum12"), new InstructorManager(54,"Gabriel","lactar","gabrieleltigre@gmail.com","gabrieladot1")};
		
		for(User user1 : users) {
			System.out.println(user1.firstName);
			System.out.println(user1.lastName);
			System.out.println(user1.eMail);
			System.out.println();
		}
		
		user.logIn();
		System.out.println();
		user.editFname();
		System.out.println();
		user.editLname();
		System.out.println();
		user.editPword();
		
		
	}

}
