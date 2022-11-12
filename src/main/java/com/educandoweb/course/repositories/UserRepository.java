package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

}
