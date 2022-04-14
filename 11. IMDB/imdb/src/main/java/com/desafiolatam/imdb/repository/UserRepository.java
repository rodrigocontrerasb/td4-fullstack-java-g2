package com.desafiolatam.imdb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafiolatam.imdb.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	// Metodos de la interfaz
	List<User> findAll();

	User findByUsername(String username);

	User findUserByEmail(String email);
}
