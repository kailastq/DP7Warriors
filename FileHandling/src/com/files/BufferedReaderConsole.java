package com.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter full Name: ");
		
		try
		{
			String name=br.readLine();
			System.out.println("Welcome "+name);
		}
		catch (IOException e)
		{
			System.out.println(e);
		}

	}

}
