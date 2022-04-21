package com.desafiolatam.imdb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafiolatam.imdb.model.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {

	// Metodos de la interfaz
	// FindAll
	List<Rating> findAll();

	// findRatingById
	Rating findRatingById(Long id);
}
