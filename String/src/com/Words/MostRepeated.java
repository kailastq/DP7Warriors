package com.Words;

public class MostRepeated {
	static void findMostRepeated(String st)
	{
		int max=0;
		int count;
		//int max=Integer.MIN_VALUE;
		String s="";
		String str[]=st.split(" ");
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals("Visited"))
				continue;
			
			count=1;
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equalsIgnoreCase(str[j]))
				{
					count++;
					str[j]="Visited";
				}
			}
		//	System.out.println(str[i]+"========>"+count);
			if(count>max)
			{
				max=count;
				s=str[i];
			}
		}
		System.out.println("Most repeated word: "+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I love my India Bcoz India is my country and my country is great";
		findMostRepeated(s);

	}

}
