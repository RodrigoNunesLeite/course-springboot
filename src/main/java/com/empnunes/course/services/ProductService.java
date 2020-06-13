package com.empnunes.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empnunes.course.entities.Category;
import com.empnunes.course.entities.Product;
import com.empnunes.course.repositories.ProductRepository;

// preciso identificar(registrando como um component) minha classe pra ser possivel
// injeta-lo em outra classe e devolver o resultado em um response

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository product;
	
	public List<Product> findAll() {
		return product.findAll();
	}
	
	public Product findById(Long id) {
		// findbyid retorna um optional
		Optional<Product> obj = product.findById(id);
		return obj.get();
	}
	
}
