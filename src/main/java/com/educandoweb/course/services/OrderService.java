package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Orders;
import com.educandoweb.course.repositories.OrderRepository;

@Service
public class OrderService {	
	
	@Autowired
	private OrderRepository repository;
	
	public List<Orders> findAll(){
		
		return repository.findAll();		
	}
	
	public Orders findById(Long id) {
		
		Optional<Orders> obj = repository.findById(id);
		
		return obj.get();
		
	}
	
	
	

}
