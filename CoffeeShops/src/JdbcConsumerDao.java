
public class JdbcConsumerDao implements IConsumerDao {
	

	@Override
	public void add(Consumer consumer) {
		System.out.println("Tüketici Jdbc ile veritabanýna eklendi");
		
	}

	@Override
	public void update(Consumer consumer) {
		System.out.println("Tüketici Jdbc ile veritabanýnda güncellendi");
		
	}

	@Override
	public void delete(Consumer consumer) {
		System.out.println("Tüketici Jdbc ile veritabanýndan silindi");
		
	}

	

}
