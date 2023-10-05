package com.Overriding;

class Student1 {
	
	private int id;
	private String name;
	protected float fees;
	
	Student1(){
		
	}
	
	Student1 (int id , String name, float fees){
		this.id=id;
		this.name=name;
		this.fees=fees;
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

	public String toString() {
		return "Student Id: " + id + "Student name: " + name + "Fees: " + fees ;
	}
	
	public void payfees() {
		System.out.println("Your fees is calculated on monthly basis: "+fees);
	}
	

}

class SchoolStudent extends Student1{
	
	private int std;
	private String scname;
	
	SchoolStudent(){
		super();
	}
	
	SchoolStudent(int id , String name, float fees, int std, String scname){
		super(id, name, fees);
		this.std=std;
		this.scname=scname;
		
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public String getScname() {
		return scname;
	}

	public void setScname(String scname) {
		this.scname = scname;
	}
	
	public void payFees() {
		System.out.println("Your Quarterly fees is: "+(fees*3));
	}
	
}

class CollegeStudent extends Student1{
	private int sem;
	private String clgname;
	
	CollegeStudent(){
		
	}
	
	CollegeStudent(int id , String name, float fees, int sem, String clgname){
		super(id, name, fees);
		this.sem=sem;
		this.clgname=clgname;
		
	}
	public int getSem() {
		return sem;
	}
	
	public void setSem(int sem) {
		this.sem=sem;
	}
	
	public String getClgname() {
		return clgname;
	}
	
	public void setClgname(String clgname) {
		this.clgname=clgname;
	}
	
	public void payfees() {
		System.out.println("Your Semester Fees is:  "+(fees*6));
	}
}

public class StudentInfo{
	
public static void main(String[] args) {
		
		Student1 s;
		
		s= new Student1(100, "Kailash", 3000);
		System.out.println(s.getName()+":");
		s.payfees();
		
		System.out.println("---------------------------------------");
		s= new SchoolStudent(101, "Vishal", 4000f, 8, "MIT ");
		System.out.println(s.getName()+":");
		s.payfees();
		
		System.out.println("-----------------------------------------");
		s=new CollegeStudent(103, "Pawan", 6000f, 5, "Horizon");
		System.out.println(s.getName()+":");
		s.payfees();
		
		
	}
	
	
}

