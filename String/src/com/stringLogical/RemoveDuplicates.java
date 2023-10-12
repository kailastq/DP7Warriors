package com.stringLogical;

public class RemoveDuplicates {
	static void removeDup(char[] str)
	{
		
		for (int i = 0; i < str.length; i++) {
			if (str[i] == '\0')
			{
				continue;
			}
			for(int j=i+1; j<str.length;j++)
			{
				if(str[i]==str[j])
				{
					str[j] ='\0';
				}
			}
			System.out.println(str[i]);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Kailash";
		char str[]=s.toCharArray();
		removeDup(str);

	}

}
