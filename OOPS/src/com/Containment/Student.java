package com.Containment;

public class Student {

	private int sid;
	private String name;
	private Course course;

	Student() {

	}

	Student(int sid, String name, Course course) {
		this.sid = sid;
		this.name = name;
		this.course = course;
	}

	public int getSid() {

		return sid;
	}

	public void setSid(int sid) {

		this.sid = sid;

	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Course getCourse() {
		return course;
	}

	public String toString() {

		return "\nStudent Details :" + sid + "\nStudentname " + name + "\nStudentCourse " + course;
	}

}