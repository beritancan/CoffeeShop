
public class Main {

	public static void main(String[] args) {
        ConsumerService consumerService = new ConsumerService(new JdbcConsumerDao());
        
        
        Consumer consumer = new Consumer();
        consumer.setId(1);
        consumer.setIdentityNumber("12345678999");
        consumer.setFirstName("Ayþe");
        consumer.setLastName("Yýlmaz");
        consumer.setYearOfBirth(1996);
        
        EDevletService.dogrula();
        consumerService.add(consumer);
        
   
        Selling selling = new StarbucksSelling();
        selling.satis();
        
        
	}

}
