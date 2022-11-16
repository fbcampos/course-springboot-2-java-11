package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.entities.Categories;

@Repository
public interface CategoryRepository extends JpaRepository<Categories, Long> {

}
