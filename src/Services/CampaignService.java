package Services;

import Entities.Campaign;
import Entities.Product;

public interface CampaignService {
	
	void addCampaign(Campaign campaign);
	
	void deleteCampaign(Campaign campaign);
	
	void updateCampaign(Campaign campaign);
	
	void applyCampaign(Campaign campaign, Product product);

}
