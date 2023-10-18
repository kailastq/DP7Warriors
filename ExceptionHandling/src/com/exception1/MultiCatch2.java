package com.exception1;

import java.util.Scanner;

public class MultiCatch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		try
		{
			int arr[]= new int[3];
			
			for(int i=0; i<arr.length; i++)
			{
				System.out.println("Enter a Number: ");
				arr[i]=sc.nextInt();
			}
			System.out.println("-----------------------------------");
			
			for(int i=0; i<arr.length; i++)
			{
				System.out.println("Ans: "+(100/arr[i]));
			}
		}
		
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
		
// Below code becomes unreachable code if you create Exception
		
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e)
		{
			System.out.println(e);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("------------------------------------------------");
			sc.close();
			System.out.println("Scanner Closed");
		}

	}

}
