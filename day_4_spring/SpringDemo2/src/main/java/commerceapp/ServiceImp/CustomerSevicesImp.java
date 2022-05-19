package commerceapp.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import commerceapp.Bean.Customer;
import commerceapp.Service.CustomerService;
import commerceapp.repositry.MyLocalRepository;


@Service
public class CustomerSevicesImp implements CustomerService {
       
	@Autowired
	MyLocalRepository localRepository;
	

	public Customer addCustomer(Customer customerDetails) {
		
		Customer customerAdded=localRepository.save(customerDetails);
				return customerAdded;
	}
	
}
