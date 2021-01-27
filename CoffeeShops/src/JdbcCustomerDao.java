
public class JdbcCustomerDao implements ICustomerDao{

	@Override
	public void add(Customer customer) {
		System.out.println("Müþteri Jdbc ile veritabanýna eklendi!");		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Müþteri Jdbc ile  veritabanýnda güncellendi!");	
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Müþteri Jdbc ile veritabanýndan silindi!");	
		
	}

}
