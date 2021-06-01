package icehs.science.chapter07;

public class Movie {
	String title;
	String director;
	String genre;
	
	Movie(){
		
	}

	public Movie(String title, String director) {
		super();
		this.title = title;
		this.director = director;
	}

	public Movie(String title, String director, String genre) {
		super();
		this.title = title;
		this.director = director;
		this.genre = genre;
	}
	
}
