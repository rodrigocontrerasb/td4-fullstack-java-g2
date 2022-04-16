package cl.desafiolatam.producerest.services;

import cl.desafiolatam.producerest.dto.UserDTO;
import cl.desafiolatam.producerest.models.User;
import cl.desafiolatam.producerest.repositories.UserRepository;
import cl.desafiolatam.producerest.utils.DTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImp implements UserService {

	private UserRepository userRepository;

	@Autowired
	public UserServiceImp(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void save(UserDTO userDTO) {
		userRepository.save(DTOMapper.toEntity(userDTO));
	}

	@Override
	public void update(UserDTO userDTO) {
		userRepository.save(DTOMapper.toEntity(userDTO));
	}

	@Override
	public List<UserDTO> findAll() {
		return userRepository.findAll().stream().map(User::toDTO).collect(Collectors.toList());
	}

	@Override
	public UserDTO findById(Long id) {
		return userRepository.findById(id).orElse(new User()).toDTO();
	}

	@Override
	public void delete(UserDTO userDTO) {
		userRepository.delete(DTOMapper.toEntity(userDTO));
	}

}
