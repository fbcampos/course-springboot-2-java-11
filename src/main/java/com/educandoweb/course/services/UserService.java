package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Users;
import com.educandoweb.course.repositories.UserRepository;

@Service
public class UserService {	
	
	@Autowired
	private UserRepository repository;
	
	public List<Users> findAll(){
		
		return repository.findAll();		
	}
	
	public Users findById(Long id) {
		
		Optional<Users> obj = repository.findById(id);
		
		return obj.get();
		
	}
	
	
	

}
