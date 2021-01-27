
public class JdbcCampaignDao implements ICampaignDao {

	@Override
	public void add(Campaign campaign) {
		 System.out.println("Kampanya Jdbc ile veritabanına eklendi");	
	}

	@Override
	public void update(Campaign campaign) {
		 System.out.println("Kampanya Jdbc ile veritabanında güncellendi.");
	}

	@Override
	public void delete(Campaign campaign) {
		 System.out.println("Kampanya Jdbc ile veritabanından silindi");
	}

}
