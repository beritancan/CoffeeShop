
public class JdbcCustomerDao implements ICustomerDao{

	@Override
	public void add(Customer customer) {
		System.out.println("Müşteri Jdbc ile veritabanına eklendi!");		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Müşteri Jdbc ile  veritabanında güncellendi!");	
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Müşteri Jdbc ile veritabanından silindi!");	
		
	}

}
