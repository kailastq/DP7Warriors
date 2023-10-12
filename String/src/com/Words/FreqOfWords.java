package com.Words;

public class FreqOfWords {
	static void wordFreq(String s) {
		
		String str[]=s.split(" ");
		
		int count;
		for(int i=0; i<str.length; i++)
		{
			if(str[i].equals("Visited"))
			{
				continue;
			}
			count=1;
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equalsIgnoreCase(str[j]))
				{
					count++;
					str[j]="Visited";
				}
			}
			System.out.println(str[i]+"========>"+count);
		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="A big cat rolling on big mat";
		wordFreq(str);
		

	}

}
