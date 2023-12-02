/*. Write a Java program to input basic salary of an employee and calculate its
Gross salary according to following: Basic Salary <= 10000 : HRA = 20%, DA = 80% Basic Salary <= 20000 : HRA = 25%,
DA = 90% Basic Salary >20000 : HRA = 30%, DA = 95% 
*/
package com.assignConditional;
import java.util.Scanner;
public class GrossSalary {

	public static void main(String[] args) {
		
		
		double hra,dra,GrossSalary;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic salary :");
		Double Bsalary=sc.nextDouble();
		
		if(Bsalary<=10000)
		{
			
		hra	=(Bsalary/100)*20;
		 dra=(Bsalary/100)*80;
		GrossSalary=Bsalary+hra+dra;
		System.out.println("Gross salary of empolyee 1 :"+GrossSalary);
		}
		else if(Bsalary<=20000)
		{
			hra=(Bsalary/100)*25;
			dra=(Bsalary/100)*90;
			GrossSalary=Bsalary+hra+dra;
			System.out.println("Gross Salary of employee 2 :"+GrossSalary);
					
		}
		else if (Bsalary>20000)
		{
			hra=(Bsalary/100)*30;
			dra=(Bsalary/100)*95;
			
			GrossSalary=Bsalary+hra+dra;
			System.out.println("Gross salary of employee 3 :"+GrossSalary);
			
		}		
	}
	}