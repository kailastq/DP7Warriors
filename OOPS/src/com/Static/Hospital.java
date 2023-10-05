package com.Static;

class Patient{
	int id;
	String Pname;
	String Dname;
	static String HospitalName;
	
	static int count=0;
	static 
	{
		HospitalName="Tata Memorial Hospital";
	}
	
	Patient(){
		
	}
	
	Patient(int id, String Pname, String Dname){
		this.id=id;
		this.Pname=Pname;
		this.Dname=Dname;
		count++;
	}
	
	public String toString() {
		return " Patient Id: "+id+"Patient Name: "+Pname+"Doctor Name: "+Dname;
	}
}

public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p1=new Patient(101, "Kailash", "Dr.Sharma");
		Patient p2=new Patient(201, "Sush", "Dr.Anil");
		Patient p3=new Patient(301, "Vishal", "Dr.Patil");
		System.out.println(Patient.HospitalName);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println("Number of Patient: "+ Patient.count);

	}

}
