package com.Abstract;

abstract class Student {
	private int id;
	private String name;
	private float fees;

	static String instituteName;
	static float discount;

	static {
		instituteName = "Star Academy";
	}

	Student() {

	}

	Student(int id, String name, float fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
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

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	public static String getInstituteName() {
		return instituteName;
	}

	public static void setInstituteName(String instituteName) {
		Student.instituteName = instituteName;
	}

	abstract void description();

	static float giveDiscount(int dis) {
		discount = dis;
		return discount;
	}

	final void display() {
		System.out.println("Institute Name: " + instituteName);
		System.out.println("--------------------------------------");

		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Fees: " + fees);
		System.out.println("Discount: " + (fees - (discount / 100) * fees));

	}
}

class DanceStudent extends Student {
	private String type;
	private int age;

	DanceStudent() {

	}

	DanceStudent(int id, String name, float fees, String type, int age) {
		super(id, name, fees);
		this.type = type;
		this.age = age;
	}

	@Override
	void description() {
		System.out.println("He is Dance Student");
		System.out.println("He likes Hip-Hop Dance");
		System.out.println("His age is: " + age);

	}
}

class MusicStudent extends Student {
	private String album;

	MusicStudent() {

	}

	MusicStudent(int id, String name, float fees, String album) {
		super(id, name, fees);
		this.album = album;
	}

	void description() {
		System.out.println("He is Music Student");
		System.out.println("He like Classical Music");
		System.out.println("His favourite Album is:" + album);
	}
}

class ArtStudent extends Student {
	private String type;

	ArtStudent() {

	}

	ArtStudent(int id, String name, float fees, String type) {
		super(id, name, fees);
		this.type = type;
	}

	void description() {
		System.out.println("He is Art Student");
		System.out.println("He Loves to Draw Painting");
		System.out.println("His Favourite painting is: " + type);
	}
}

public class AbstractDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.giveDiscount(20);

		DanceStudent d = new DanceStudent(100, "Kailash", 6000, "Hip-Hop", 22);
		d.display();
		d.description();

		System.out.println("------------------------------------------------------------");

		MusicStudent m = new MusicStudent(101, "Vishal", 5000, "Over the Years");
		m.display();
		m.description();

		System.out.println("------------------------------------------------------------");

		ArtStudent a = new ArtStudent(102, "Shiv", 11000, "Painting");
		a.display();
		a.description();

	}

}
