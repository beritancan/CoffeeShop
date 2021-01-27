
public class JdbcConsumerDao implements IConsumerDao {
	

	@Override
	public void add(Consumer consumer) {
		System.out.println("Tüketici Jdbc ile veritabanına eklendi");
		
	}

	@Override
	public void update(Consumer consumer) {
		System.out.println("Tüketici Jdbc ile veritabanında güncellendi");
		
	}

	@Override
	public void delete(Consumer consumer) {
		System.out.println("Tüketici Jdbc ile veritabanından silindi");
		
	}

	

}
