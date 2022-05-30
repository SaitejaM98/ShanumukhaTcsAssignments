package com.ecart.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecart.bean.Order;
import com.ecart.repo.OrderRepo;
import com.ecart.service.OrderService;

@Service
public class OrderServiceImp implements OrderService {
    
	
	@Autowired
	OrderRepo orderrepo;
	@Override
	public Order createOder(Order order) {

		Order ord = orderrepo.save(order); //saving 
		return ord;
	}

}
