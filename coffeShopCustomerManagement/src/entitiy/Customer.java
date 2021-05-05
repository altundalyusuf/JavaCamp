package entitiy;

import java.util.Date;

import abstractFolder.*;

public class Customer implements Entitiy {
	

	public int id;
	public String firstName;
	public String lastName;
	public Date dateOfBirth;
	public String nationalityId;
	
	public Customer() {
		
	}
	
	public Customer(int id, String firstName, String lastName, Date dateOfBirth, String nationalityId) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}
}
