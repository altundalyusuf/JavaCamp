package javaGame;

public class Campaign implements CampaignInterface {
	private int discount;
	private String name;
	private boolean isCampaign = false;
	
	public Campaign(int discount, String name) {
		this.discount = discount;
		this.name = name;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public boolean getIsCampaign() {
		return isCampaign;
	}
	public void setIsCampaign(boolean isCampaign) {
		this.isCampaign = isCampaign;
	}

}
