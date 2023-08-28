package com.operator;

import java.util.Scanner;

public class VolumeofCylinder {
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius:");
		float radius = sc.nextFloat();
		System.out.println("Enter the height:");
		float height = sc.nextFloat();
	
		
		System.out.println("Volume of cylinder:" +Math.PI*radius*radius*height);
		
		
	}
	

}
