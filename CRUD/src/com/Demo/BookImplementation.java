package com.Demo;

import java.util.Scanner;

public class BookImplementation implements Bookdetails {
	
	Scanner sc=new Scanner(System.in);
	Book b[]=new Book[10];
	int id;
	int price;
	String bookname;
	String authorname;
	int count=0;
	
	

	@Override
	public void addBook() {
		// TODO Auto-generated method stub
		System.out.println("Add Book");
		
		System.err.println("Enter number of Books you want to add: ");
		int num=sc.nextInt();
		
		for(int i=0; i<num; i++)
		{
			System.out.println("Enter Book Id: ");
			int id=sc.nextInt();
			
			System.out.println("Enter Book name: ");
			String name=sc.next();
			
			System.out.println("Enter Price: ");
			int price=sc.nextInt();
			
			System.out.println("Enter Author Name: ");
			String authur_name=sc.next();
			
			b[count]=new Book(id, bookname, price, authorname);
			count++;
					
		}
		System.out.println("Add Book Sucessfully...");
		
		
	}

	@Override
	public void UpdateBook() {
		// TODO Auto-generated method stub
		System.out.println("Update Book");
		System.out.println("Enter the Book id you want to Update: ");
		int id=sc.nextInt();
		for(int i=0; i<count ; i++)
		{
			if(id==b[i].getId() && b[i]!=null) {
				System.out.println("Enter Book name: ");
				String name=sc.next();
				
				System.out.println("Enter Author name: ");
				String author_name=sc.next();
				
				System.out.println("Enter book price: ");
				int price=sc.nextInt();
				b[i].setPrice(price);
				
			}
		}
		System.out.println("Book Update Sucessfully...");
		
		
	}

	@Override
	public void showBook() {
		// TODO Auto-generated method stub
		for(int i=0; i<count; i++)
		{
			if(b[i]!=null)
			{
				System.out.println(b[i]);
			}
		}
		
	}

	@Override
	public void deleteBook() {
		// TODO Auto-generated method stub
		System.out.println("Delete Book: ");
		System.out.println("Enter the book id you want to delete: ");
		int id=sc.nextInt();
		for(int i=0; i<count; i++)
		{
			if(id==b[i].getId())
			{
				b[i]=null;
			}
		}
		System.out.println("Delete Book Sucessfully...");
		
	}

	@Override
	public void searchBook() {
		// TODO Auto-generated method stub
		System.out.println("Search Book");
		System.out.println("Enter the book id you want to search");
		int id=sc.nextInt();
		
		int flag=0;
		int i;
		for(i=0; i<count; i++)
		{
			if(id==b[i].getId() && b[i]!=null)
			{
				flag =1;
				break;
				
			}
		}
		if(flag==1) {
			System.out.println("Given book Available");
			System.out.println(b[i]);
		}
		else
		{
			System.out.println("Given book is not Available");
		}
		
	}

}
