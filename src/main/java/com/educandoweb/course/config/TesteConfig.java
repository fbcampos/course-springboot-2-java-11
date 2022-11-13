package com.educandoweb.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.Orders;
import com.educandoweb.course.entities.Users;
import com.educandoweb.course.repositories.OrderRepository;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository  userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	

	@Override
	public void run(String... args) throws Exception {
		Users u1 = new Users(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		Users u2 = new Users(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Orders o1 = new Orders(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Orders o2 = new Orders(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Orders o3 = new Orders(null, Instant.parse("2019-07-22T15:21:22Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}

}
