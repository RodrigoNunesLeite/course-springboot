package com.empnunes.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empnunes.course.entities.Category;
import com.empnunes.course.repositories.CategoryRepository;

// preciso identificar(registrando como um component) minha classe pra ser possivel
// injeta-lo em outra classe e devolver o resultado em um response

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository category;
	
	public List<Category> findAll() {
		return category.findAll();
	}
	
	public Category findById(Long id) {
		// findbyid retorna um optional
		Optional<Category> obj = category.findById(id);
		return obj.get();
	}
	
}
