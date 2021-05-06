package javaGame;

public class CustomerManager  implements OptionsForUser {
	
	Customer customer;
	boolean isDeleted = false;
	
	public CustomerManager(Customer customer) {
		this.customer = customer;
	}

	@Override
	public void registertoGame(String firstName, String lastName, String nationalId, String bornYear, int money) {
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setNationalId(nationalId);
		customer.setBornYear(bornYear);
		customer.setMoney(money);
		
		System.out.println("You've successfully registered.");
		
	}

	@Override
	public void updateFirstName(String firstName) {
		customer.setFirstName(firstName);
		System.out.println("Your first name changed with : " + customer.getFirstName());
		
	}
	

	@Override
	public void updateLastName(String lastName) {
		customer.setLastName(lastName);
		System.out.println("Your last name changed with : "+ customer.getLastName());
		
	}

	@Override
	public void updateNationalId(String nationalId) {
		customer.setNationalId(nationalId);
		System.out.println("Your national id changed with : "+ customer.getNationalId());
		
	}

	@Override
	public void updateBornYear(String bornYear) {
		customer.setBornYear(bornYear);
		System.out.println("Your born year changed with : " + customer.getBornYear());
		
	}
	
	public int buyFromWallet(int unitPrice) {
		 customer.setMoney(customer.getMoney()-unitPrice);
		 return customer.getMoney();
	}
	
	@Override
	public void deleteAccount() {
		customer.setBornYear(null);
		customer.setFirstName(null);
		customer.setLastName(null);
		customer.setNationalId(null);
		isDeleted = true;
		System.out.println("Your account has deleted.");
	}
	
	

	public void showInfos() {
		if(isDeleted) {
			System.out.println("Could not find account.");
		}
		else {
			System.out.println("----------------------------------------");
			System.out.println("Your account infos: ");
			System.out.println("Born year -> " + customer.getBornYear());
			System.out.println("First Name -> " + customer.getFirstName());
			System.out.println("Last Name -> " + customer.getLastName());
			System.out.println("National id -> " + customer.getNationalId());
			System.out.println("----------------------------------------");
		}
		
	}
	
	
	
}
