
public class JdbcCampaignDao implements ICampaignDao {

	@Override
	public void add(Campaign campaign) {
		 System.out.println("Kampanya Jdbc ile veritabanýna eklendi");	
	}

	@Override
	public void update(Campaign campaign) {
		 System.out.println("Kampanya Jdbc ile veritabanýnda güncellendi.");
	}

	@Override
	public void delete(Campaign campaign) {
		 System.out.println("Kampanya Jdbc ile veritabanýndan silindi");
	}

}
