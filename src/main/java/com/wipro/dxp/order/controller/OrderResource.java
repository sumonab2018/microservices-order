package com.wipro.dxp.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.dxp.order.models.Order;
import com.wipro.dxp.order.repository.OrderRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/*import com.wipro.dxp.order.api.mapper.OrderMapper;
import com.wipro.dxp.order.api.model.CreateOrUpdateOrderPayload;
import com.wipro.dxp.order.api.model.QueryOrderResult;
import com.wipro.dxp.order.domain.Order;
import com.wipro.dxp.order.service.OrderService;*/

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@Api(value="Order API", description="Order service API")
public class OrderResource {

	@Autowired
	private OrderRepository orderRepository;

	@ApiOperation(value = "Get all orders")
	@GetMapping("/orders")
	public List<Order> getOrders() {
		return orderRepository.findAll();
	}

	@ApiOperation(value = "Create an order")
	@PostMapping("/orders")
	public String createOrder(@RequestBody Order order) {
		order = orderRepository.save(order);
		return order.getId();
	}

	@ApiOperation(value = "Search an order by id")
	@GetMapping("/orders/{id}")
	public Optional<Order> getOrder(@PathVariable String id) {
		Optional<Order> order = orderRepository.findById(id);
		if (order == null) {
			throw new NotFoundException();
		} else {
			//fillProductDetails(shoppingList);
			return order;
		}
	}
	

}
