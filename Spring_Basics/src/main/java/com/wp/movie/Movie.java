package com.wp.movie;

public class Movie {

	private String movieId;
	private String movieName;
	private String movieActor;
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	public Movie(String movieId, String movieName, String movieActor) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieActor = movieActor;
	}

	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieActor() {
		return movieActor;
	}
	public void setMovieActor(String movieActor) {
		this.movieActor = movieActor;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieActor=" + movieActor + "]";
	}
	
	
}
