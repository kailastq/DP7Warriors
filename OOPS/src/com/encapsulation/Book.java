package com.encapsulation;

public class Book {
	
	
		private int bookId;
		private String bname;
		private float price;
		
		
		public void setBookId(int bookId)
		{
			this.bookId=bookId;
		}
		public int getBookId()	{
			return bookId;
		}
		
		public void setBname (String bname) {
			this.bname=bname;
		}

		public String getBname() {
			return bname;
		}
		public void setPrice(Float price) {
			this.price=price;
		}
		public float getPrice() {
			return price;
		}
		
		/* 
		 * public void display ()
		 * {
		 * system.out.println(bookId+ "  " +bname+ "  "+price); 
		 *  } */
		public String toString()
		{
			return "BookId: "+ bookId+ "Book Name: "+ bname+" Price: "+ price;
		}
		public void setPrice(float price) {
			this.price=price;
		}
		
		

	}

