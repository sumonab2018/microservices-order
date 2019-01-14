package com.wipro.dxp.order.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wipro.dxp.order.models.Order;

public interface OrderRepository extends MongoRepository<Order, String> {


	//public Optional<Order> findOne(long id);
	
}
