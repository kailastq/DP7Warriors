package com.stringLogical;

public class AlphabeticallySort {
	static void sortAlphabets(String s)
	{
		char ch[]=s.toCharArray();
		boolean flag=true;
		
		for(int i=0; i<ch.length; i++)
		{
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i]>ch[j])
				{
					flag=false;
				}
			}
			
		}
		if(flag==true)
		{
			System.out.println("Word is Alphabetically sort");
		}
		else
		{
			System.out.println("Word is not Alphabetically sort");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="camel";
		sortAlphabets(str);

	}

}
