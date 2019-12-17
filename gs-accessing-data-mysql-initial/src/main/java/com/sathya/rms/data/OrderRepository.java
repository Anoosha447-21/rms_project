package com.sathya.rms.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.entities.Order;



public interface OrderRepository extends CrudRepository<Order, Integer> {

}
