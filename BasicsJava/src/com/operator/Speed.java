package com.operator;

import  java. util .Scanner;

public class Speed {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("distance: ");
		float distance = sc.nextFloat();

		System.out.println(" time: ");
		double time = sc.nextDouble();

		 double Speed = distance / time;

		System.out.println(" The speed is: " + Speed);

	}

}
