package com.Classwork;

class Car{
	public Car() {
		System.out.println("Class Car");
	}
	public void vehicletype() {
		System.out.println("Four Wheeler");
	}
}

class Audi extends Car{
	public Audi() {
		System.out.println("Audi Q8");
	}
	public void brandname() {
		System.out.println("Brandname is Audi");
	}
	
	public void topspeed() {
		System.out.println("Top Speed of Audi Q8 is 250km/h");
	}
}

class AudiEtron extends Audi{
	public void brandname1() {
		System.out.println("Audi E-Tron");
	}
	public void power() {
		System.out.println("The power of Audi E-Tron is 5000Watt");
	}
}

public class Multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.vehicletype();
		
		Audi a=new Audi();
		a.brandname();
		a.topspeed();
		
		AudiEtron ae=new AudiEtron();
		ae.brandname1();
		ae.power();

	}

}
