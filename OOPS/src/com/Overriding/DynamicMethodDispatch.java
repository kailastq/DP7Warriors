package com.Overriding;

class MyPerson {
	void display() 
	{
		System.out.println("I am a person");
	}
}

class MyEmployee extends MyPerson {

	@Override
	public void display() // protected or public but not default or private
	{
		// super.display();
		System.out.println("I am an employee");

	}

	void show()
	{
		System.out.println("Employee is showing talent");
	}

}

class MyCelebrity extends MyPerson {
	@Override
	void display()
	{
		System.out.println("I am an celebrity");
	}

}

public class DynamicMethodDispatch {

	public static void main(String[] args) {

		MyPerson p;

		p = new MyPerson();

		p.display();

		MyEmployee e1 = new MyEmployee();
		e1.display();
		e1.show();

		p = new MyEmployee();
		p.display();
		// p.show(); This method is not accesible

		p = new MyCelebrity();
		p.display();

	}

}
