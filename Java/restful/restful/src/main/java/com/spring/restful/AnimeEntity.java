package com.spring.restful;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "anime")
public class AnimeEntity {
	
	@Id
	@GeneratedValue
	public int id;
	@Column(name = "aname")
	public String name;
	@Column(name = "agenre")
	public String genre;
	@Column(name = "arating")
	public int rating;
	
	public AnimeEntity() {
		super();
	}

	public AnimeEntity(String name, String genre, int rating) {
		super();
		this.name = name;
		this.genre = genre;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
