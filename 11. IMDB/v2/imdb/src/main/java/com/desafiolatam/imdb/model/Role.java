package com.desafiolatam.imdb.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "role_name")
	private String name;
	// RELACIONES
	// AGREGAR A la DDBB
	// INSERT INTO examen_final.roles (id, name) VALUES (1, 'ROLE_USER');
	// INSERT INTO examen_final.roles (id, name) VALUES (2, 'ROLE_ADMIN');
	@ManyToMany(mappedBy = "roles")
	private List<User> users;

	public Role() {
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

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
