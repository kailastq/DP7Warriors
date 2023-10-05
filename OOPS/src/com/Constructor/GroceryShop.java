package com.Constructor;

class Item{
	private int itemId;
	private String itemName;
	private float price;
	
	Item()
	{
		
	}
	
	Item(int itemId, String itemName, float price){
		this.itemId=itemId;
		this.itemName=itemName;
		this.price=price;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId=itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName() {
		this.itemName=itemName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price=price;
	}
	
	public String toString() {
		return itemId+" "+itemName+ " "+price;
	}
}

public class GroceryShop{
	
	static void Discount(Item i) {
		if(i.getPrice()>100)
		{
			float p=i.getPrice();
			p= (p-(0.1f*p));
			i.setPrice(p);
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Item I1=new Item(101," Soap ",100f);
		Item I2=new Item(102," Wafers ",300f);
		Item I3=new Item(103," Rice",150f);
		
		
		System.out.println(I1);
		System.out.println(I2);
		System.out.println(I3);
		
		Discount(I2);
		Discount(I3);
		
		System.out.println("-------------After Discount--------------");
		System.out.println(I1);
		System.out.println(I2);
		System.out.println(I3);
	}

}
