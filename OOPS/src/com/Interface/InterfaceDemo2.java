package com.Interface;

interface TaxPay {
	String cname = "India";

	void taxamount();
}

class Celebrity implements TaxPay {
	String celebname;
	float income;

	Celebrity() {

	}

	Celebrity(String celebname, float income) {
		super();
		this.celebname = celebname;
		this.income = income;
	}

	public void taxamount() {
		// 20%
		System.out.println("Celebrity Have to pay :" + (0.2 * income));
	}
}

class Employee implements TaxPay {
	String name;
	float salary;

	public Employee() {
		super();

	}

	Employee(String name, float salary) {
		this.name = name;
		this.salary = salary;
	}

	public void taxamount() {
		if (salary > 500000) {
			System.out.println("Celebrity amount of tax: " + (0.1 * salary));
		} else {
			System.out.println("Your salary is tax free");
		}
	}

}

public class InterfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Celebrity c1=new Celebrity("SRK", 500000);
		c1.taxamount();
		
		Employee e1=new Employee("Kailash", 60000);
		e1.taxamount();

	}

}
