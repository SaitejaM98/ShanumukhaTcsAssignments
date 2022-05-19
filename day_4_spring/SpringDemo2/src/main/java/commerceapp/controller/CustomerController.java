package commerceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import commerceapp.Bean.Customer;
import commerceapp.Service.CustomerService;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;
	
	@GetMapping(value="/addCustomer")
	Customer addCustomer(@RequestBody Customer customerDetails) {
		
		Customer customers=customerService.addCustomer(customerDetails);
		return customers;
	}
	
}
