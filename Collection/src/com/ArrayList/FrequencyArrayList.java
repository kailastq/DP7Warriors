package com.ArrayList;

import java.util.ArrayList;

public class FrequencyArrayList {
	
	static void calfreq(ArrayList<String> list)
	{
		int count;
		for(int i=0; i<list.size();i++)
		{
			count=1;
			if(list.get(i).equals("visited"))
				continue;
			for(int j=i+1; j<list.size();j++)
			{
				if(list.get(i).equals(list.get(j)))
				{
					count++;
					list.set(j, "visited");
				}
			}
			System.out.println(list.get(i)+"-------->"+count);
			
		}

	}
	
	
	static void findDuplicate(ArrayList<String> list)
	{
		int count;
		for(int i=0; i<list.size();i++)
		{
			count=1;
			if(list.get(i).equals("visited"))
				continue;
			for(int j=i+1; j<list.size();j++)
			{
				if(list.get(i).equals(list.get(j)))
				{
					count++;
					list.set(j, "visited");
				}
			}
			if(count>1)
			System.out.println(list.get(i)+"-------->"+count);
			
		}

	}
	
	static void findUnique(ArrayList<String> list)
	{
		int count;
		for(int i=0; i<list.size();i++)
		{
			count=1;
			if(list.get(i).equals("visited"))
				continue;
			for(int j=i+1; j<list.size();j++)
			{
				if(list.get(i).equals(list.get(j)))
				{
					count++;
					list.set(j, "visited");
				}
			}
			if(count==1)
			System.out.println(list.get(i)+"-------->"+count);
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList<>();
		
		a1.add("A");
		a1.add("B");
		a1.add("A");
		a1.add("C");
		a1.add("D");
		a1.add("B");
		a1.add("D");
		a1.add("A");
		
		
		//calfreq(a1);
		System.out.println("----------------");
		//findDuplicate(a1);
		findUnique(a1);

		


	}

}
