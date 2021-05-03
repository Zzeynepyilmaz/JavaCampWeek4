package interfaceAbstractDemo;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Zeynep");
		customer.setLastName("Yýlmaz");
		customer.setDateOfBirth("16.01.2001");
		customer.setNationalityId("123456789");
		
		customerManager.save(customer);

	}

}
