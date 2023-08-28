package com.switchst;

import java.util.Scanner;

public class NumberofDays {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the month (lowercase)");
		 
		 String mName=sc.next();
		 
		 switch(mName)
		 {
		 case "january":
		 case "march":
		 case"may": 
	     case "july":
		 case "august": 
		 case "october":
		 case"decemeber":
         System.out.println("31days");
		 break;

		 case "april":
		 case "june":
		 case "september":
		case "november":
          System.out.println("30 days"); break;

		 case "february":
		 System.out.println("Enter the year");
		 int year =sc.nextInt();
		 if((year%4==0)||((year%40==0)&&(year%100!= 0)))
		 {
			 System.out.println("29 days");
		 }
		 else
		 {
			 System.out.println("28 days");
		 }
		 break;
		 default:System.out.println(" Error ");
		 }

	}

}
