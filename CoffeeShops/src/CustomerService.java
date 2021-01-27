
public class CustomerService implements ICustomerService {

	ICustomerDao customerDao;
	
	public CustomerService(ICustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		
	}

}
