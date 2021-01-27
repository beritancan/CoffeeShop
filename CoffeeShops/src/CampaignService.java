
public class CampaignService implements ICampaignService {
	
	ICampaignDao campaignDao;

	public CampaignService(ICampaignDao campaignDao) {
		this.campaignDao = campaignDao;
	}

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi. Tebrikler bir y�ld�z kazand�n�z!");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya g�ncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi.");
		
	}

}
