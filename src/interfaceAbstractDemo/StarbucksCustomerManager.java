package interfaceAbstractDemo;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
			System.out.println("Validation successfull");
		}else {
			System.out.println("Not a valid person");
		}
	
		
		
	}

	
}
