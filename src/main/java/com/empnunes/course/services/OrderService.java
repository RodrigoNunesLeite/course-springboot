package com.empnunes.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empnunes.course.entities.Order;
import com.empnunes.course.entities.User;
import com.empnunes.course.repositories.OrderRepository;

// preciso identificar(registrando como um component) minha classe pra ser possivel
// injeta-lo em outra classe e devolver o resultado em um response

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		// findbyid retorna um optional
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	
}
