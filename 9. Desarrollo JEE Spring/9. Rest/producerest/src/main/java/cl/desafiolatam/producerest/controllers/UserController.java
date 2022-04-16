package cl.desafiolatam.producerest.controllers;

import cl.desafiolatam.producerest.dto.UserDTO;
import cl.desafiolatam.producerest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;


// llamado
// http://localhost:8080/api/v1/users

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<UserDTO> findAll() {
		return userService.findAll();
	}

	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public UserDTO findOne(@PathVariable Long id) {
		return userService.findById(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody UserDTO user) {
		userService.save(user);
	}

	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	void update(@RequestBody UserDTO userDTO) {
		userService.update(userDTO);
	}

	@DeleteMapping
	@ResponseStatus(HttpStatus.OK)
	void delete(@RequestBody UserDTO userDTO) {
		userService.delete(userDTO);
	}

}
