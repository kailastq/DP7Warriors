package com.string;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="java is fun.";
		System.out.println(str.length());
		System.out.println(str.length()-1);
		
		//charAt
		
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(str.length()-1));  // last char
		
		
		// concat , + -----> to combined we used this
		String s1="Hello";
		String s2="World";
		
		System.out.println(s1+s2);
		System.out.println(str.concat(s2));
		
		//substring 
		
		System.out.println(str.substring(1));
		System.out.println(str.substring(1, 6));  //print from 1 to 5
		
		//Contains
		
		System.out.println(str.contains("ava"));
		System.out.println(str.contains("orl"));

		String w1="hi";
		String w2="Hi";
		
		System.out.println(w1==w2); // false
		System.out.println(w1.equals(w2)); //false
		
		System.err.println(w1.equalsIgnoreCase(w2));
		
		// Upper case
		System.out.println(str.toUpperCase());
		
		System.out.println(str.toLowerCase());
		
		// indexOf, lastIndexOf
		
		System.out.println(str.indexOf('a'));
		System.out.println(str.lastIndexOf('a'));
		
		System.err.println(str.indexOf("fun"));
		
		// is Empty
		
		System.out.println(str.isEmpty());
		
		String s="";
		System.out.println(s.isEmpty());
		
		//trim 
		String st=" java   ";
		System.out.println(st.length());
		
		st=st.trim();
		System.out.println(st+st.length());
		
		// compareTo :  returns int
		
		// equals : returns boolean - true/false
		
		System.out.println("Kailash".compareTo("Kailash"));
		System.out.println("Kailash".compareTo("vishal")); //M<N by 1 value -1
		 
		 System.out.println("Vishal".compareTo("Kailash"));
		 
		 System.out.println("kailash".compareTo("Pawan"));
		 
		 // postive if 1st ascii char is greater
		 // negative if 1st  ascii is smaller
		 // same - it will give zero
		 
		 
		 // lexographical comparison(Dictionary order)
		 
		 String a1="Java";
		 String a2= "Python";
		 
		 System.out.println(a1.length()>a2.length());
		 
		 System.out.println(a1.compareTo(a2));
		 
		 System.out.println(a1.compareTo(a2)>0);
		
		
	}

}
