package com.sathya.rms.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.data.OrderRepository;
import com.sathya.rms.entities.Order;
import com.sathya.rms.services.OrderService;
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderRepository orderrepository;
	@Transactional
	@Override
	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		return orderrepository.save(order);
	}

	@Override
	public Iterable<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return orderrepository.findAll();
	}
	@Transactional
	@Override
	public Order updateOrder(Order order) {
		// TODO Auto-generated method stub
		return orderrepository.save(order);
	}
	@Transactional
	@Override
	public void deleteOrder(Integer id) {
		// TODO Auto-generated method stub
		orderrepository.deleteById(id);

	}

}
