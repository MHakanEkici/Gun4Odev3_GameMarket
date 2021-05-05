package Manager;

import Entities.Campaign;
import Entities.Product;
import Services.CampaignService;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("Campaign named " + campaign.getCampaignName() + " added.");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Campaign named " + campaign.getCampaignName() + " deleted.");
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("Campaign named " + campaign.getCampaignName() + " updated.");
		
	}

	@Override
	public void applyCampaign(Campaign campaign, Product product) {
		
		System.out.println("Non discounted price of " + product.getName() + " is " + product.getPrice());
		
		product.setPrice(product.getPrice() - product.getPrice() * campaign.getDiscountRate() / 100);
		
		System.out.println("Discounted price of " + product.getName() + " is " + product.getPrice());
		
	}

	
	

}
