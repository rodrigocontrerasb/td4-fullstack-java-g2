package cl.desafiolatam.producerest.services;

import cl.desafiolatam.producerest.dto.UserDTO;
import java.util.List;

public interface UserService {

	void save(UserDTO user);

	void update(UserDTO user);

	List<UserDTO> findAll();

	UserDTO findById(Long id);

	void delete(UserDTO user);

}
