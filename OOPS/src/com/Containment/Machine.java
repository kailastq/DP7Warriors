package com.Containment;

public class Machine {
	
	private String type;
	private Engine e;
	
	Machine(){
		
	}
	
	Machine(String type, Engine e){
		this.type=type;
		this.e=e;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}

	public String toString() {
		return "Machine type: " + type + "Engine: " + e;
	}
	
	

}
