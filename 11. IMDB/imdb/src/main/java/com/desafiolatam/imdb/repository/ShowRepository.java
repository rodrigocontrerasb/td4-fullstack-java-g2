package com.desafiolatam.imdb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafiolatam.imdb.model.Show;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long> {
	
	// Metodos de la interfaz
	// findAll
	List<Show> findAll();
}
