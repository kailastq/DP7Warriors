package com.Pattern;

public class LeftAngledAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		for( int i=n;i>=1;i--)
		{
			for(int j=1; j<=(n-i); j++)
			{
				System.out.print("   ");
			}
			// for alphabets
			char ch='G';
					for(int j=1;j<=i;j++)
					{
						System.out.print(ch+" ");
					}
					System.out.println();
		}

	}

}
