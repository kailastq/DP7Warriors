package com.Words;

public class DuplicateString {
	static void findDuplicatesString(String st)
	{
		int count;
		int max=Integer.MIN_VALUE;
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
			if(count>1)
			{
				System.out.println(str[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I love my India Bcoz India is my country and my country is great";
		findDuplicatesString(s);


	}

}
