
public class ConsumerService implements IConsumerService {

	SellingService sellingService;
	IConsumerDao consumerDao;
	EDevletService eDevletService;
	
	public ConsumerService(SellingService sellingService, IConsumerDao consumerDao, EDevletService eDevletService) {
		super();
		this.sellingService = sellingService;
		this.consumerDao = consumerDao;
		this.eDevletService = eDevletService;
	}

	public ConsumerService(IConsumerDao consumerDao) {
		this.consumerDao = consumerDao;
	}
	

	@Override
	public void add(Consumer consumer) {
		System.out.println("Müþteri eklendi");
		
	}

	@Override
	public void update(Consumer consumer) {
		System.out.println("Müþteri güncellendi");
		
	}

	@Override
	public void delete(Consumer consumer) {
		System.out.println("Müþteri silindi");
		
	}

	
}
