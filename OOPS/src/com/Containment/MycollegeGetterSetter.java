package com.Containment;

public class MycollegeGetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c1=new Course();
		c1.setCid(101);
		c1.setCname("Full stack");
		c1.setFees(65000f);
		
		Student s1=new Student();
		s1.setSid(1);
		s1.setName("Kailash");
		s1.setCourse(c1);
		
		System.out.println(s1);
		
		// 2nd Way
		
		Student s2=new Student();
		s2.setSid(2);
		s2.setName("Vishal");
		s2.setCourse(new Course());
		s2.getCourse(). setCid(102);
		s2.getCourse(). setCname("Java");
		s2.getCourse(). setFees(65400f);
		
		System.out.println(s2);
	}

}
