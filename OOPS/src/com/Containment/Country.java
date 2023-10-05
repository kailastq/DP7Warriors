package com.Containment;

class Country 
{
	private int id;
	private String countryname;
	
	Country(){
		
	}
	
	Country(int id, String countryname){
		this.id=id;
		this.countryname=countryname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return countryname;
	}

	public void setName(String countryname) {
		this.countryname = countryname;
	}

	public String toString() {
		return "\nCountry Id: " + id + "\nCountry Name: " + countryname ;
	}
	
}
