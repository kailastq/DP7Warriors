package com.Static;

class Candidate {
	int id;
	String name;

	static String schname = "MIT";

	Candidate() {

	}

	Candidate(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println("Student Details is: ");
		System.out.println(id);
		System.out.println(name);

	}

//	public String  toString() {
//		return "Id: " + id + "Name: " + name;
//	
//	}
}

public class CandidateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidate c1 = new Candidate(100, "Kailash");
		c1.display();

// System.out.println(c1);

	}
}
