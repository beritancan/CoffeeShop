
public class JdbcCampaignDao implements ICampaignDao {

	@Override
	public void add(Campaign campaign) {
		 System.out.println("Kampanya Jdbc ile veritaban�na eklendi");	
	}

	@Override
	public void update(Campaign campaign) {
		 System.out.println("Kampanya Jdbc ile veritaban�nda g�ncellendi.");
	}

	@Override
	public void delete(Campaign campaign) {
		 System.out.println("Kampanya Jdbc ile veritaban�ndan silindi");
	}

}
