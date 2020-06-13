package com.empnunes.course.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.empnunes.course.entities.User;
import com.empnunes.course.repositories.UserRepository;
import com.empnunes.course.services.exceptions.DatabaseException;
import com.empnunes.course.services.exceptions.ResourceNotFoundException;

// preciso identificar(registrando como um component) minha classe pra ser possivel
// injeta-lo em outra classe e devolver o resultado em um response

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		// findbyid retorna um optional
		Optional<User> obj = repository.findById(id);
		// orElseThrow tentar retornar o get, senão retorna uma exceção
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		// o save ja retorna o objeto salvo
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public User update(Long id, User obj) {
		try {
		// o getOne não vai no banco ainda, ele instancia o objeto e 
		// esse objeto fica monitorado pelo JPA
		User entity = repository.getOne(id);
		/*
		 * O valor obj é atribuido ao objeto entity
		 * */
		updateData(entity, obj);
		return repository.save(entity);
		} catch(EntityNotFoundException e ){
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
	
}
