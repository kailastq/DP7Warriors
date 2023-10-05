package com.Constructor;

public class StudentInfo {
	
	private int Studentid;
	private String Studentname;
	private String Studentaddress;
	private String collegeName;

		StudentInfo()
		{
			
		}
		StudentInfo( int Studentid, String Studentname, String Studentaddress, String collegename ){
			this.Studentid=Studentid;
			this.collegeName=Studentname;
			this.Studentaddress=Studentaddress;
			this.collegeName=collegeName;
		}
	public  static  void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
