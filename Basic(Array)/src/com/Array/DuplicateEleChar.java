package com.Array;

public class DuplicateEleChar {
	static void findDuplicate(char[] arr) {
		int count;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]=='\0')
				continue;
			count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
				count++;
				arr[j]='\0';
			}
		}
		
		if(count>1)
		{
			System.out.println(arr[i]);
		}
		
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]= { 'a', 'd', 'r', 'd','q','v','l'};
		System.out.println("Dupliacate element are: ");
		findDuplicate(arr);

	}

}
