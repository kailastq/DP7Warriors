package com.innerDemo;

class Mall 
{
	private String mallname="Phoenix Marketcity";
	private String location="Pune";
	
	void shopping() {
		
		class Cart{
			String item;
			int price;
			static double bill=0;
			
			public void additem(String item, int price) {
				this.item=item;
				this.price=price;
				
				
				System.out.println(this.item+" "+this.price);
				bill=bill+price;
			}
			
			public void displayBill() {
				System.out.println("-------------------------------------------------");
				System.out.println("TOTAL BILL: "+bill);
				
				System.out.println("--------------------------------------------------");
				System.out.println("Thanks for shopping at: "+mallname+", "+location);
			}
		}
		Cart c1=new Cart();
		c1.additem("Iphone15", 75000);
		c1.additem("Jacket", 11000);
		c1.additem("LED Tv", 59000);
		
		c1.displayBill();
	}
	
}

public class LocalinnerClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mall customer=new Mall();
		customer.shopping();

	}

}
