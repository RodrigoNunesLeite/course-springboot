package com.empnunes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empnunes.course.entities.Category;

// <Tipo da entidade, tipo do id>
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
