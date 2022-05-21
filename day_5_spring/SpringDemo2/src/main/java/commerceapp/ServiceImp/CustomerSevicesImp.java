package commerceapp.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import commerceapp.Bean.Customer;
import commerceapp.Service.CustomerService;
import commerceapp.repositry.MyLocalRepository;

@Service
public class CustomerSevicesImp implements CustomerService {

	@Autowired
	MyLocalRepository localRepository;

	// adding customer
	@Override
	public Customer addCustomer(Customer customerDetails) {

		Customer customerAdded = localRepository.save(customerDetails);
		return customerAdded;
	}

	

	// updating customer
	@Override
	public Customer updatecustomer(Customer customerDetails, long id) {
		customerDetails.setId(id);
		Customer updatedcustomer = localRepository.save(customerDetails);

		return updatedcustomer;
	}

	@Override
	public void deleteCustomer(Customer customerDetails, long id) {
		localRepository.deleteById(id);
		
	}

	@Override
	public List<Customer> getAllListofCustomers() {
		List<Customer> listofcustomers = localRepository.findAll();
		return listofcustomers;
	}

}
