package cl.desafiolatam.producerest.models;

import cl.desafiolatam.producerest.dto.UserDTO;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String alias;

	public UserDTO toDTO() {
		UserDTO userDTO = new UserDTO();
		userDTO.setId(this.getId());
		userDTO.setName(this.getName());
		userDTO.setAlias(this.getAlias());
		return userDTO;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

}
