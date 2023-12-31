package com.comparable;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	private float marks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
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

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

//
//	@Override
//	public int compareTo(Student s) {
//		
//		if(this.getMarks()==s.getMarks())
//			return 0;
//		else
//			if(this.getMarks()<s.getMarks())
//				return -1;
//			else 
//				return 1;
//		
//	}

	@Override
	public int compareTo(Student s) {

		return (int) (this.marks - s.marks);

	}

//	@Override
//	public int compareTo(Student s) {
//		
//		if(this.getMarks()==s.getMarks())
//			return this.getName().compareTo(s.getName());
//		else
//			if(this.getMarks()<s.getMarks())
//				return -1;
//			else 
//				return 1;
//		
//	}
//	

//	@Override
//	public int compareTo(Student s) {
//		
//		if(this.getMarks()==s.getMarks())
//		{
//			if(this.id==s.getId())
//				return 0;
//			else if(this.id<s.id)
//			      return -1;
//			else
//				return 1;
//			    		  
//		}
//		
//		else
//			if(this.getMarks()<s.getMarks())
//				return -1;
//			else 
//				return 1;
//		
//	}

//	@Override
//	public int compareTo(Student s) {
//		
//		if(this.getMarks()==s.getMarks())
//		{
//			if(this.name.compareTo(s.name)==0)
//			{
//				if(this.id==s.getId())
//					return 0;
//				else if(this.id<s.id)
//				      return -1;
//				else
//					return 1;
//			}
//			else
//				return this.name.compareTo(s.name);
//		}
//		
//		else
//			if(this.getMarks()<s.getMarks())
//				return -1;
//			else 
//				return 1;
//		
//	}
//	

}
