package Entities;

public class Campaign {
	private int campaignId;
	private int discountRate;
	private String campaignName;
	
	public Campaign() {
		
	}

	public Campaign(int campaignId, int discountRate, String campaignName) {
		super();
		this.campaignId = campaignId;
		this.discountRate = discountRate;
		this.campaignName = campaignName;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	
	

}
