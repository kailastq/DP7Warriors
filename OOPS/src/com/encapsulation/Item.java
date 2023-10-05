package com.encapsulation;

public class Item {
	int item_id=100;
	String item_name="Pant";
	float item_price=10.5f;
	
	void display()
	{
		System.out.println(" Itemid "+item_id+" item_name "+item_name+" item_price "+item_price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item obj=new Item();
		obj.display();
		
		

	}

}
