package javaGame;
						// Bu class oyunu oynamak isteyen kiþinin ne tür bilgileri olduðunu tutacak.
public class Customer implements CustomerInterface {
	
	private String firstName;
	private String lastName;
	private String nationalId;
	private String bornYear;
	private int money;
	

	public Customer(String firstName, String lastName, String nationalId, String bornYear, int money) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalId = nationalId;
		this.bornYear = bornYear;
		this.money = money;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalId() {
		return nationalId;
	}
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	public String getBornYear() {
		return bornYear;
	}
	public void setBornYear(String bornYear) {
		this.bornYear = bornYear;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
}
