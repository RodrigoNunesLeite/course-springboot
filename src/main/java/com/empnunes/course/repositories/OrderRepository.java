package com.empnunes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empnunes.course.entities.Order;

// <Tipo da entidade, tipo do id>
public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
