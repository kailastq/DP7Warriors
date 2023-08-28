package com.switchst;
import java.util.Scanner;
public class AtmSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int pin=1234;
		System.out.println("Enter ur pin");
		int pin1=sc.nextInt();
		double bal=10000;
		System.out.println("Enter ur choice");
		int choice=sc.nextInt();
		
		
		if(pin==pin1)
		{
		
			System.out.println("Welcome to HDFC bank");
		}
			else
			 {
				 System.out.println("your pin is not correct");
				 
			 }
			
		}
		 if(choice==1)
		 {		 
		
			System.out.println("Enter the amount to depost");
			double dep=sc.nextDouble();
			System.out.println("your new Balance "+(bal+=dep));
		}
		 else if(choice==2)
		 {
			 System.out.println("Enter the amount to withdraw");
			 double withdraw=sc.nextDouble();
			 System.out.println("your new Balance after withdrawal is"+(bal-=withdraw));
		 }
			
		 else if(choice==3)
		 {
			 
			 System.out.println("Check balance");
			 System.out.println("available balance "+bal);
			 
		 }
		 else if(choice==4)
		 {
			 System.out.println("Exit");
			 
		 }
		}
		 else
		 {
			 System.out.println("your pin is not correct");
			 
		 }
			
		}
		
		
		
		
		
		
		
		
	}