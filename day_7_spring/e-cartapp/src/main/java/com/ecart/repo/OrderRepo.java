package com.ecart.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecart.bean.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order,Long>{

}
