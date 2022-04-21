package com.desafiolatam.imdb.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", nullable = false, unique = true)
	private Long id;
	@Size(min = 3, message = "El nombre de usuario debe estar presente")
	private String username;
	@Size(min = 5, message = "El email debe estar presente y en un formato válido")
	private String email;
	@Size(min = 8, message = "La Password debe estar presente y en un formato válido")
	private String password;
	@Transient
	private String passwordConfirmation;

	public User() {
	}

	// Relaciones
	// 1:N SHOW
	@OneToMany(mappedBy = "creatorShow", fetch = FetchType.LAZY)
	List<Show> userShows;

	public List<Show> getUserShows() {
		return userShows;
	}

	public void setUserShows(List<Show> userShows) {
		this.userShows = userShows;
	}

	// 1:N RATING
	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	private List<Rating> ratings;

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	// Roles
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<Role> roles;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}

	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "User [username=" + username + "]";
	}
}
