
public class JdbcConsumerDao implements IConsumerDao {
	

	@Override
	public void add(Consumer consumer) {
		System.out.println("T�ketici Jdbc ile veritaban�na eklendi");
		
	}

	@Override
	public void update(Consumer consumer) {
		System.out.println("T�ketici Jdbc ile veritaban�nda g�ncellendi");
		
	}

	@Override
	public void delete(Consumer consumer) {
		System.out.println("T�ketici Jdbc ile veritaban�ndan silindi");
		
	}

	

}
