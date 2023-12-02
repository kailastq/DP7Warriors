package com.Constructor;

class Academy {
	private int capacity;
	private String address;
	private String batch;

	Academy() {

	}

	Academy(int capacity, String address, String batch) {
		this.capacity = capacity;
		this.address = address;
		this.batch = batch;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

}
