package com.Example;

public class Theatre {
	private int id;
	private String name;
	private Movie movie[];
	
	Theatre(){
		
	}
	
	Theatre(int id, String name, Movie m[]){
		this.id=id;
		this.name=name;
		this.movie=movie;
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

	public Movie[] getMovie() {
		return movie;
	}

	public void setMovie(Movie movie[]) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Theatre [id=" + id + ", name=" + name + ", movie=" + movie + "]";
	}
	
	
	

}
