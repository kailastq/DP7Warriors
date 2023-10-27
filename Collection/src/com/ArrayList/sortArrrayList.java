package com.ArrayList;

import java.util.ArrayList;

public class sortArrrayList {
	static void sortArrayList(ArrayList<Integer> list){
		for(int i=0; i<list.size(); i++)
		{
			for(int j=i+1; j<list.size();j++)
			{
				if(list.get(i)>list.get(j))
				{
					int temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList<>();
		
		a1.add(58);
		a1.add(88);
		a1.add(67);
		a1.add(10);
		a1.add(25);
		a1.add(89);
		a1.add(5);
		
		
		System.out.println("Before: "+a1);
		
		sortArrayList(a1);
		
		System.out.println("After: "+a1);

		

	}

}
