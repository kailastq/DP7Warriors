package com.covariant;

class Test {
	Number value;

	Number displayValue() {
		return value;
	}

}

class Child1 extends Test {

	Float myVal;

	Float displayValue() {
		return myVal;
	}

}

// Character is not sub class of Number
// hence not allowed

//class Child2 extends Test
//{
//	
//    Character ch;
//    
//    Character displayValue()
//    {
//    	ch='A';
//    	return ch;
//    }
//
//
//}

public class CovariantWrapperDemo2 {

	public static void main(String[] args) {

		Test t = new Test();
		t.value = 89;
		System.out.println("Value is:" + t.displayValue());

		Child1 c = new Child1();
		c.myVal=55.0f;
		System.out.println("Value is :" + (c.displayValue()));

	}
}
