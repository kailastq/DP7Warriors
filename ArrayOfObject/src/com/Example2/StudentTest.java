package com.Example2;

public class StudentTest {
	static float calcPercentage(Student s)
	{
		float m[]=s.getMarks();
		float total=0;
		for(float m1:m)
		{
			total=total +m1;
		}
		
		float per=(total/500)*100;
		return per;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st[]=new Student[3];
		
		float m1[]= { 65.4f, 68.2f, 78.3f};
		st[0]=new Student(101, "Kailash", m1);
		
		float m2[]= { 69.4f, 98.2f, 58.3f};
		st[1]=new Student(102, "Vishal", m2);

		float m3[]= { 77.4f, 88.2f, 48.3f};
//		st[2]=new Student(103, "Anuj", m3);
		st[2]=new Student();
		st[2].setId(103);
		st[2].setName("Anuj");
		st[2].setMarks(m3);
		
		System.out.println("-------------------------------------------------");
		
		for(Student s:st)
		{
			//System.out.println(s);
			System.out.println(s.getId()+" "+s.getName()+" "+calcPercentage(s));
		}


	}

}
