package com.Forloops;
import java.util.Scanner;
public class FactorofAnyNo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num=sc.nextInt();
		int i;

		System.out.println(" The Factor of " +num+ " are");
				for(i=1; i<=num; i++)
				{
					if(num%i==0)
					{
						System.out.print(i+" ");
					}
				}

	}

}
