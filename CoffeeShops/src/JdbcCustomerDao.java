
public class JdbcCustomerDao implements ICustomerDao{

	@Override
	public void add(Customer customer) {
		System.out.println("M��teri Jdbc ile veritaban�na eklendi!");		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("M��teri Jdbc ile  veritaban�nda g�ncellendi!");	
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("M��teri Jdbc ile veritaban�ndan silindi!");	
		
	}

}
