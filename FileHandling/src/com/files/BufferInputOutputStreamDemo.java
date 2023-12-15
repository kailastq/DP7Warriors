package com.files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferInputOutputStreamDemo {
	
	public void writeData(File f)
	{
		try
		{
			if(!f.exists())
			{
				f.createNewFile();
			}
			
			String data="Welcome to India...";
			FileOutputStream fout= new FileOutputStream(f);
			
			BufferedOutputStream bout= new BufferedOutputStream(fout);
			
			byte[] arr = data.getBytes();
			
			bout.write(arr);
			System.out.println("Data added");
			bout.close();
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
				
				BufferedInputStream bin= new BufferedInputStream(new FileInputStream(f));
				
				int i = 0;
				
				while((i=bin.read()) !=-1)
				{
					System.out.print((char) i);
				}
				
				bin.close();
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
		BufferInputOutputStreamDemo obj = new BufferInputOutputStreamDemo();
		
		File f1= new File("D:\\MyFiles\\buffIo.txt");
		obj.writeData(f1);
		obj.readData(f1);

	}

}
