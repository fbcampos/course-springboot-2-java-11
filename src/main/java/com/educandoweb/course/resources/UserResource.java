package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Users;



@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<Users> findAll() {
		Users u = new Users(1L, "Maria", "maria@gmail.com", "01299876675", "12345");
		return ResponseEntity.ok().body(u);
	}
}
