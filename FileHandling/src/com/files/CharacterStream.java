package com.files;

import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStream {
	
	public void writeData(File f)
	{
		try
		{
			if(!f.exists())
			{
				f.createNewFile();
			}
			
			FileWriter fw= new FileWriter(f);
			fw.write("My name is Kailash\n");
			fw.write("I am 23 years old..");
			
			System.out.println("Added...");
			fw.close();
					

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public void readData(File f)
	{
		try
		{
			if (f.exists()) {
				FileReader fr= new FileReader(f);

				int i = 0;
				
				while((i=fr.read())!=-1)
				{
					System.out.print((char)i);
					
				}
				
				fr.close();

			}
			else
			{
				System.out.println("File doesnot exist....");
			}
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
	
}
	
	public static void main(String[] args) {
		
		CharacterStream obj = new CharacterStream();
		
		File f1= new File("D:\\MyFiles\\charIO.txt");
		obj.writeData(f1);
		obj.readData(f1);
		
	}
}
		