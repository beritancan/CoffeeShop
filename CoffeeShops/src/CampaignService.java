
public class CampaignService implements ICampaignService {
	
	ICampaignDao campaignDao;

	public CampaignService(ICampaignDao campaignDao) {
		this.campaignDao = campaignDao;
	}

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi. Tebrikler bir yýldýz kazandýnýz!");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi.");
		
	}

}
