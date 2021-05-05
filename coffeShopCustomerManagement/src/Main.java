import java.util.Date;

import abstractFolder.*;
import adaptors.MernisServiceAdapter;
import concrete.*;
import entitiy.*;



public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new  StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(245,"Engin","Demiroð", new Date(1985/1/6), "32657215692"));
		
		
	}

}
