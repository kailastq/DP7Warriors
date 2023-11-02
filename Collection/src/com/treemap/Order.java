package com.treemap;

public class Order {
	
	private int id;
	private  String Product;
	private int price;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int id, String product, int price) {
		super();
		this.id = id;
		Product = product;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct() {
		return Product;
	}

	public void setProduct(String product) {
		Product = product;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", Product=" + Product + ", price=" + price + "]";
	}
	
	
	
	

}
