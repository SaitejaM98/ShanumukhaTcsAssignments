package com.ecart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecart.bean.Order;
import com.ecart.service.OrderService;

@RestController
public class OrderController {
    @Autowired
    OrderService orderSer;
    
    @PostMapping(value="/createorder")
	Order addOrder(@RequestBody Order order) {

		Order addorder = orderSer.createOder(order);
		return addorder;
		
    }
}
