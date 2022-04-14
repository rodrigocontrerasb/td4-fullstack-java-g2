package com.desafiolatam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.desafiolatam.imdb.model.User;
import com.desafiolatam.imdb.repository.RoleRepository;
import com.desafiolatam.imdb.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	// Create 
	public void saveWithUserRole(User user) {

		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setRoles(roleRepository.findByName("ROLE_USER"));
		userRepository.save(user);
	}

	public void saveUserWithAdminRole(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setRoles(roleRepository.findByName("ROLE_ADMIN"));
		userRepository.save(user);
	}

	//  
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	public User findUserById(Long id) {
		Optional<User> optionalUser = userRepository.findById(id);
		if (optionalUser.isPresent()) {
			return optionalUser.get();
		} else {
			return null;
		}
	}

	public User findUserByEmail(String email) {
		return userRepository.findUserByEmail(email);
	}

	// Buscar todos 
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}

	// Crear 
	public void createUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		userRepository.save(user);

	}

	// Actualizar 
	public void updateUser(User user) {
		userRepository.save(user);
	}

	// Eliminar 
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
}
