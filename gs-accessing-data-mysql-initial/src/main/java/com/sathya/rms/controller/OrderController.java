package com.sathya.rms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.entities.Order;
import com.sathya.rms.services.OrderService;



@RestController
@RequestMapping(path="/order")
public class OrderController {
	@Autowired
	OrderService orderservice;
	@PostMapping(path="/addOrder")
	public Order addOrder(@RequestBody Order order) {
		return orderservice.addOrder(order);
	}
	@PutMapping(path="/updateOrder")
	public Order updateOrder(@RequestBody Order order) {
		return orderservice.updateOrder(order);
	}
	@GetMapping(path="/getAllOrders")
	public Iterable<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return orderservice.getAllOrders();
	}
	@DeleteMapping(path="/deleteOrder/{id}")
	public void deleteOrder(@PathVariable("id") Integer id) {
		// TODO Auto-generated method stub
		orderservice.deleteOrder(id);

	}
}
