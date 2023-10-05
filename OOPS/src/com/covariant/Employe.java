package com.covariant;

class Employ {
	int id;
	String name;

	Employ() {

	}

	Employ(int id, String name) {
		this.id = id;
		this.name = name;
	}

	static Employ display() {
		Employ e1 = new Employ(100, "Kailash");
		return e1;

	}

	@Override
	public String toString() {
		return "Employee Id: " + id + "\nName: " + name;
	}

}

public class Employe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e;
		e=new Employee();
		
		System.out.println(Employ.display());
	// 	System.out.println(e.display());  // if dont give the static 

	}

}
