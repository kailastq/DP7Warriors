package com.stringLogical;

public class AverageofDigitInString {
	static void findAvg(String str) {
		int sum=0;
		int count=0;
		int avg=0;
		char ch[]=str.toCharArray();
		
		for(int i=0; i<ch.length;i++)
		{
			if(ch[i]>=48 && ch[i]<=57)
			{
				sum=sum+ch[i];
				count++;
				avg=sum/count;
			}
		}
		System.out.println("Average is: "+(avg-48));
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I purchased 15 chocolate for Rs.55";
		findAvg(s);
		
		
		

	}

}
