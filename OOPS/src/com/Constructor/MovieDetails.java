package com.Constructor;

class Movie{
	private int movieId;
	private String movieName;
	private float rating;

Movie()
{
	
}
Movie(int movieId, String movieName, float rating){
		this.movieId=movieId;
		this.movieName=movieName;
		this.rating=rating;
	}
public int getMovieId() {
	return movieId;
}
public void setMovieId(int movieId) {
	this.movieId=movieId;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName=movieName;
}
public float getRating() {
	return rating;
}
public void setRating(float rating) {
	 this.rating=rating;
}
 		public String toString() {
 			return movieId+" "+movieName+" "+rating;
 		}

}

public class MovieDetails{
	
	static void ratingCheck(Movie m) {
		if(m.getRating()>=6)
		{
				System.out.println(m);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m1=new Movie(100,"JAWAAN",5f);
		Movie m2=new Movie(102,"DHAMAAL",8f);
		Movie m3=new Movie(104,"JUDWAA",7f);
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
		System.out.println("--------------After--------------");
		
		ratingCheck(m1);
		ratingCheck(m2);
		ratingCheck(m3);
		

	}
}


