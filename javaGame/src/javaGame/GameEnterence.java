package javaGame;

public class GameEnterence implements GameEnterenceInterface {
	Customer customer;
	
	
	public GameEnterence(Customer customer) {;
		this.customer = customer;
	}


	@Override
	public void infoCheck(String firstName, String lastName, String nationalId, String bornYear) {
		if (customer.getFirstName() == firstName && customer.getLastName() == lastName && customer.getNationalId() == nationalId && customer.getBornYear() == bornYear) {
			System.out.println("You've entered your account successfully.");
		}
		else {
			System.out.println("Your registration informations are wrong !");
		}
		
	}

}
