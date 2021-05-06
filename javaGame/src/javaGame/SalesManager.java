package javaGame;

public class SalesManager implements SalesManagerInterface {

	Sales sales;
	CampaignManagerInterface saleCampaign;
	
	
	
	public SalesManager( CampaignManagerInterface saleCampaign, Sales sales) {
		this.saleCampaign = saleCampaign;
		this.sales = sales;
	}


	public void buyGame(Customer customer) {
		
		if(saleCampaign.isCampaign()) {
			int temp;
			temp = sales.getUnitPrice() - (sales.getUnitPrice() * saleCampaign.showDiscount()/100);
			if(customer.getMoney() >= temp) {
				customer.setMoney(customer.getMoney()- temp);
				sales.setUnitPrice(temp);
				System.out.println("You bought on discount. Game added to your library.");
			}
			else {
				System.out.println("You don't have enough money.");
			}
		}
		
		else {
			if(customer.getMoney() >= sales.getUnitPrice()) {
				customer.setMoney(customer.getMoney()- sales.getUnitPrice());
				System.out.println("Game added to your library.");
			}
			else {
				System.out.println("You don't have enough money.");
			}
		}
		
		
	}
	
		

	
}
