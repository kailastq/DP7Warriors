package com.Array;

public class FindFreqOfChar {
	static void countChar(char arr[]) {
		int count;
		
		for(char i=0;i<arr.length;i++) {
			if(arr[i]=='0')
				continue;
			count=1;
			for(int j=i+1; j<arr.length;j++) {
				if(arr[j]==arr[i]) {
					count++;
					arr[j]='0';
				}
			}
			if(count>=0) {
				System.out.println(arr[i]+"→"+count);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[]= {'a','c','s','a','b','s','c','a','c'};
		countChar(ch);

	}

}
