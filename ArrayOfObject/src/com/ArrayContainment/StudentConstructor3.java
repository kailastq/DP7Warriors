package com.ArrayContainment;

public class StudentConstructor3 {
	
	static void countStudentCoursewise(Student st[], Course cour[]) {
		int count;
		for(Course c:cour)
		{
			count=0;
			for(Student s:st)
			{
				if(s.getCourse().equals(c))
				{
					count++;
				}
			}
			System.out.println(c+": "+count);
		}
	}
	
	static void infoStudentCoursewise(Student st[] , Course cour[])
	{
		for (Course c: cour)
		{
			System.out.println(c);
			for(Student s:st)
			{
				if(s.getCourse().equals(c))
				{
					// System.out.println(s);
					System.out.println(s.getId()+" "+s.getName());
				}
			}
			System.out.println("---------------------------------------------------------");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Course co[] = new Course[3];
		co[0] = new Course(101, "Java", 34000);
		co[1] = new Course(102, ".net", 35000);
		co[2] = new Course(103, "Python", 25000);

		Student stud[] = new Student[6];

		stud[0] = new Student(1, "Aniket", co[1]);
		stud[1] = new Student(2, "Shivam", co[2]);
		stud[2] = new Student(3, "Pawan", co[0]);

		// hard code getter setter

		stud[3] = new Student();
		stud[3].setId(4);
		stud[3].setName("Vishal");
		stud[3].setCourse(co[0]);

		stud[4] = new Student(5, "Pralay", co[1]);
		stud[5] = new Student(6, "Anuj", co[1]);
		
		for(Student s:stud)
		{
			System.out.println(s);
		}
		
		countStudentCoursewise(stud,co);
		
		System.out.println("================================");
		
		infoStudentCoursewise(stud, co); 
	}
	

}
