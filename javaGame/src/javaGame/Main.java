package javaGame;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer("Halit","Fifte","12345678910","2000",500);
		CustomerManager cs = new CustomerManager(customer);
		CampaignManager campaign = new CampaignManager(new Campaign(10,"Spring Discount"));
		GameEnterence gamer = new GameEnterence(customer);
		SalesManager sales = new SalesManager( campaign, new Sales(25));
		
		cs.registertoGame("Yusuf", "Aktaþ", "12345678910", "2000",150);
		cs.updateFirstName("Mustafa");
		cs.updateBornYear("1986");
		cs.updateLastName("demirok");
		cs.updateNationalId("54213678216");
		cs.showInfos();
		
		cs.deleteAccount();
		cs.showInfos();
		
		
		campaign.addCampaign();
		campaign.deleteCampaign();
		campaign.showDiscount();
		campaign.isCampaign();
		campaign.updateCampaignDiscount(30);
		campaign.updateCampaignName("All week discount");
		
		
		gamer.infoCheck("Mehmet", "Teri", "12265789267", "1968");
		gamer.infoCheck("Halit","Fifte","12345678910","2000");
		
		
		sales.buyGame(customer);
		
		
		
		

	}

}
