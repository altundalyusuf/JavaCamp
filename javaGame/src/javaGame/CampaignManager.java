package javaGame;

public class CampaignManager implements CampaignManagerInterface {
	
	Campaign campaign;
	
	
	public CampaignManager(Campaign campaign) {
		this.campaign = campaign;
	}

	@Override
	public void addCampaign() {
		System.out.println( campaign.getName() + " campaign is available. You have %" + campaign.getDiscount() + " discount");
		campaign.setIsCampaign(true);
	}

	@Override
	public void deleteCampaign() {
		System.out.println(campaign.getName() + " campaign is over. ");	
		campaign.setIsCampaign(false);
	}

	@Override
	public void updateCampaignName(String newName) {
		System.out.println(campaign.getName() + " campaign updated. ");
		campaign.setName(newName);
		System.out.println("New campaign name: " + campaign.getName());
		
	}

	@Override
	public void updateCampaignDiscount( int newDiscount) {
		System.out.println(campaign.getName() + " campaign updated. ");
		campaign.setDiscount(newDiscount);
		System.out.println("New discount : %" + campaign.getDiscount());
		
	}
	
	public boolean isCampaign() {
		return campaign.getIsCampaign();
	}

	@Override
	public int showDiscount() {
		return campaign.getDiscount();
	}

	


	
}
