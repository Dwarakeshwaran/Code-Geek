package dwarki.exercise.java.collections.list;

public class Books implements Comparable<Books> {

	private String name;
	private String author;
	private String genre;
	private Integer rating;
	private Integer price;

	public Books(String name, String author, String genre, Integer rating, Integer price) {
		super();
		this.name = name;
		this.author = author;
		this.genre = genre;
		this.rating = rating;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Books [name=" + name + ", author=" + author + ", genre=" + genre + ", rating=" + rating + ", price="
				+ price + "]";
	}

	@Override
	public int compareTo(Books o) {

		if (this.getRating() > o.getRating())
			return 1;
		else
			return -1;
	}

}
