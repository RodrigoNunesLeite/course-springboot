package com.empnunes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empnunes.course.entities.Product;

// <Tipo da entidade, tipo do id>
public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
