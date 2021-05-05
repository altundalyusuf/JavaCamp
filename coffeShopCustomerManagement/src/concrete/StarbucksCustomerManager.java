package concrete;

import abstractFolder.*;
import entitiy.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager  {
	
	private CustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService _customerCheckService) {
		this._customerCheckService = _customerCheckService;
	}

	@Override
	public void save(Customer customer) 
	{
		if(_customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Saved to db : " + customer.firstName);
		}
		else {
			System.out.println("Not a valid person");
		}
		
		
		
	}



	
	
}
