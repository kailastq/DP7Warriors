package com.operator;

import java.util.Scanner;

public class AreaCircle {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
				double radius, area, perimeter;
				
				//ctrl+space: to give option
				System.out.println("Enter the radius:");
				radius= sc.nextDouble();
				area= Math. PI* radius*radius;
				perimeter= 2* Math.PI *radius;
				System.out.println("Area of circle:" +area);
				System.out.println("perimeter of  circle:" +perimeter);
	}

}
