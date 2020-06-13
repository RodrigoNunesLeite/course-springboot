package com.empnunes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empnunes.course.entities.OrderItem;

// <Tipo da entidade, tipo do id>
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
