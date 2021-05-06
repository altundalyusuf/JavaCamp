package javaGame;

public interface CampaignManagerInterface {
	public void addCampaign();
	public void deleteCampaign();
	public void updateCampaignName( String newName);
	public void updateCampaignDiscount( int newDiscount);
	public boolean isCampaign();
	public int showDiscount();
}
