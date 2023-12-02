//Write a Java program to input any character and check whether it is alphabet, digit or special character 

package com.assignConditional;
import java.util.Scanner;

public class AlphDigiChar {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println(" Enter Any character: ");
		 char ch=sc.next().charAt(0);
		 
		 if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
		 {
			 System.out.println(" It is Alphabet");
		 }
		 else if(ch>='0' && ch<='9')
		 {
			 System.out.println(" It is Digit");
		 }
		 else
		 {
			 System.out.println(" It is Special Character..");
		 }

	}

}
