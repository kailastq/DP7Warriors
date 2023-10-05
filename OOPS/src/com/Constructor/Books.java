package com.Constructor;

class Book1{
	private int bookid;
	private String bookname;
	private String date;
	private float price;
	private char category;
	
	Book1()
{
		
	}
	Book1(int bookid, String bookname, String date, float price, char category){
		 this.bookid=bookid;
		this.bookname=bookname;
		this.date=date;
		this.price=price;
		this.category=category;
	}
	
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid=bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname=bookname;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date=date;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price=price;
	}
	public char getCategory() {
		return category;
	}
	public void setCategory() {
		this.category=category;
	}
	public String toString() {
		return bookid+"  "+bookname+"  "+date+"  "+price+" " +category;
	}
}

public class Books {
			static void  getDiscount(Book1 b)
	{
		if(b.getCategory()=='S')
		{
			float dis=b.getPrice();
			dis=(dis-(0.2f*dis));
			b.setPrice(dis);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book1  b1=new Book1(1, "java", "7/08/2000", 200f, 'S');
		Book1  b2=new Book1(2,"Python", "16/08/2000",300f, 'P');
		Book1  b3=new Book1(3,"C Programming", "10/08/2000",500f, 'K');
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.println("---------------------After Discount--------------------");
		
		getDiscount(b1);
		getDiscount(b2);
		getDiscount(b3);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		
		
	}

}
