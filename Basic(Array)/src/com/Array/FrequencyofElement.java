package com.Array;

public class FrequencyofElement {
	static void Findfreq (int arr[]){
		int count;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]=='\0')
				continue;
			count=1;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]='\0';
				}
			}
			System.out.println(arr[i]+"------>"+count);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= { 3,5,8,9,3,8,7,1,8,3,6};
		Findfreq(arr);

	}

}
