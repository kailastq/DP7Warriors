package com.Example;

import java.util.Scanner;

public class TheatreMain {

	static Scanner sc = new Scanner(System.in);

//	static void enterInfo(Theatre th)
//	{
//		System.out.println("Enter Theatre id: ");
//		th.setId(sc.nextInt());
//		
//		System.out.println("Enter Theatre Name: ");
//		th.setName(sc.next());
//		
//		th.setMovie(new Movie());
//		
//		System.out.println("Enter Movie Id: ");
//		th.getMovie().setId(sc.nextInt());
//		
//		System.out.println("Enter Movie name: ");
//		th.getMovie().setName(sc.next());
//		
//		System.out.println("Enter Ratings: ");
//		th.getMovie().setRating(sc.nextFloat());
//	}
//	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m[] = new Movie[3];

		m[0] = new Movie(1, "KRISh", 8.7f);
		m[1] = new Movie(2, "RRR", 9.7f);
		m[2] = new Movie(3, "THOR", 7.6f);

		Theatre t[] = new Theatre[4];

		t[0] = new Theatre(100, "Inox", m);
		t[1] = new Theatre(101, "BigCinemas", m);
		t[2] = new Theatre(102, "PVR", m);

		for (Theatre t1 : t)
		{
			System.out.println(t1);
		}

	}

}
