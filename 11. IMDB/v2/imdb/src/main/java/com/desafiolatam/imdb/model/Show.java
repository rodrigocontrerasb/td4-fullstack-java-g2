package com.desafiolatam.imdb.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "shows")
public class Show {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "show_id", nullable = false, unique = true)
	private Long id;
	@Size(min = 1, message = "Titulo es requerido")
	private String showTitle;
	@Size(min = 1, message = "Network es requerido")
	private String showNetwork;

	public Show() {
	}

	// RELACIONES
	// N:1 USER
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User creatorShow;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "shows_ratings", joinColumns = @JoinColumn(name = "show_id"), inverseJoinColumns = @JoinColumn(name = "rating_id"))
	private List<Rating> ratings;

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getShowTitle() {
		return showTitle;
	}

	public void setShowTitle(String showTitle) {
		this.showTitle = showTitle;
	}

	public String getShowNetwork() {
		return showNetwork;
	}

	public void setShowNetwork(String showNetwork) {
		this.showNetwork = showNetwork;
	}

	public User getCreatorShow() {
		return creatorShow;
	}

	public void setCreatorShow(User creatorShow) {
		this.creatorShow = creatorShow;
	}
}
