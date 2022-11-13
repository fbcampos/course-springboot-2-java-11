package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.entities.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

}
