package com.spring.restful;

public class Anime {
	
	public int id;
	public String name;
	public String genre;
	public int rating;
	
	public Anime() {
		super();
	}

	public Anime(String name, String genre, int rating) {
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

	@Override
	public String toString() {
		return "Anime [id=" + id + ", name=" + name + ", genre=" + genre + ", rating=" + rating + "]";
	}

	
	

}
