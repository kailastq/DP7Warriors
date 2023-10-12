package com.Example;

public class School {
	
	static void findTopper(Student std[])
	{
		float maxMarks=Float.MIN_VALUE;
		Student st=new Student();
		
		for(Student s:std)
		{
			if(s.getMarks()>maxMarks)
			{
				maxMarks=s.getMarks();
				st=s;
			}
		}
		System.out.println(st);
	}
	
	
	static void sortMarks(Student std[])
	{
		Student st=new Student();
		
		for(int i=0; i<std.length;i++)
		{
			for(int j=i+1; j<std.length;j++)
			{
				if(std[i].getMarks()< std[j].getMarks())
				{
					st=std[i];
					std[i]=std[j];
					std[j]=st;
					
				}
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Student s = new Student();
		Student st[] = new Student[5];
		
//		System.out.println(st[0]);  return null object is not created yet
		
		// creating using constructor

		st[0] = new Student(100, "Kailash", 86.5f);
		st[1] = new Student(101, "Anuj", 88.5f);
		st[2] = new Student(102, "Vishal", 76.5f);
		st[3] = new Student(103, "Shiv", 96.4f);
		st[4] = new Student(104, "Pawan", 77.4f);
		
//	st[5] = new Student(104, "Pawan", 77.4f); Array index out of bound Exception

		
		for(Student s:st)
		{
			System.out.println(s);
		}
		
		System.out.println("-----------------------------------------------");
		
		for(int i=0; i<st.length;i++)
		{
			System.out.println(st[i]);
		}
		System.out.println("------------------------------------------------");
		System.out.println("Topper of the School is: ");
		findTopper(st);
		
		System.out.println("--------------------------------------------------");
		sortMarks(st);
		for(Student s:st)
		{
			System.out.println(s);
		}

	}

}
