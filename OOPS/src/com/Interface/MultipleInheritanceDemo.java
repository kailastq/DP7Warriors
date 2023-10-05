package com.Interface;

interface Showable{
	void display();
}

interface PrintMe{
	void display();
	
}
class Demo implements Showable, PrintMe{
	public void display() {
		System.out.println("Hello");
	}
}

public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.display();

	}

}
