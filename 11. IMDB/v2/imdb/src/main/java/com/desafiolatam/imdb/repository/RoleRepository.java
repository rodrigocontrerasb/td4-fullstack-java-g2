package com.desafiolatam.imdb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafiolatam.imdb.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	
	// Metodos de la intefaz
	// findAll
	List<Role> findAll();

	// findByName
	List<Role> findByName(String name);
}
