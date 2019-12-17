package com.sathya.rms.services;

import com.sathya.rms.entities.Order;

public interface OrderService {
	
	public Order addOrder(Order order);

	public Iterable<Order> getAllOrders();

	public Order updateOrder(Order order);

	public void deleteOrder(Integer id);

}
