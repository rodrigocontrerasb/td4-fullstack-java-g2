package com.desafiolatam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafiolatam.imdb.model.Show;
import com.desafiolatam.imdb.repository.ShowRepository;

@Service
public class ShowService {

	@Autowired
	private ShowRepository showRepository;

	// Buscar uno
	public Show findById(Long id) {
		Optional<Show> optionalShow = showRepository.findById(id);
		if (optionalShow.isPresent()) {
			return optionalShow.get();
		} else {
			return null;
		}
	}

	// Find All 
	public List<Show> findAllShows() {
		return showRepository.findAll();
	}
	
	// Create - Save
	public void saveShow(Show show) {
		showRepository.save(show);
	}

	// Create - Update
	public void updateShow(Show show) {
		showRepository.save(show);
	}

	// Delete
	public void deleteShow(Long id) {
		showRepository.deleteById(id);
	}
}
