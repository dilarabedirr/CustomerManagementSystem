package abstracts;

import entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealCustomer(Customer customer);

}
