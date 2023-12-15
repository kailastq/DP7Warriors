package com.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutputStreamDemo {
	
	public void writeData(File f)
	{
		try
		{
			if(!f.exists())
			{
				f.createNewFile();
			}
			
			String data="I am Kailash..";
			
			FileOutputStream fout= new FileOutputStream(f);
			
			byte[] arr = data.getBytes();
			
			fout.write(arr);
			//System.out.println("Data added");
			fout.close();
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
			if(f.exists())
			{
				FileInputStream fin = new FileInputStream(f);
				
				int i = 0;
				
				while((i=fin.read()) !=-1)
				{
					System.out.print((char) i);
				}
				
				fin.close();
			}
			else
			{
				System.out.println("File does not exist...");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputOutputStreamDemo obj = new FileInputOutputStreamDemo();
		
		File f1= new File("D:\\MyFiles\\FileIo.txt");
		obj.writeData(f1);
		obj.readData(f1);

	}

}
