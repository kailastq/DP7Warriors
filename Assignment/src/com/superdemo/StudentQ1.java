//Create a class Student with int id and String name as member variables...
/*Generate getter and setter methods for id and name. Observe in the generated setter method
how the parameter’s value is assigned to the member variable using this keyword. */
/*What would happen in the setter method if you remove ‘this.’ when assigning the parameter
value? */
//Set id of first student to 11 and 21 to the other student’s id



package com.superdemo;

class Student{
		int id;
		private String name;
		
		Student(){
			
		}
		
		Student(int id, String name){
			this.id=id;
			this.name=name;
		}

//		public int getId() {
//			return id;
//		}
//
//		public void setId(int id) {
//			this.id = id;
//		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			name=name;  // if we remove "this." the assign value does not affect
		}
		
		public String toString() {
			return "Student ID: "+id+"\nName: "+name;
		}
}

public class StudentQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(100, "Kailash");
		// Student s1=new Student(11, "Kailash");
		Student s2=new Student(200, "Pawan");
		// Student s1=new Student(12, "Pawan");
		
		System.out.println(s1);
		System.out.println("----------------------");
		System.out.println(s2);
		

	}

}
