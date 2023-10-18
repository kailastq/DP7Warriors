package com.MethodOverriding;

import java.io.IOException;

class Vehicle4
{
	
   int data=50;
   
   // throws checked exception
   
   void printData() throws Exception
   {
	   System.out.println(data);
   }

}

// child class : overriding: can throw unchecked exception
 //                         
 // it can throw :  same checked exception, sub type
                      // not super type
//

class Car4 extends Vehicle4
{
	
   int val=10;
   
   void printData() throws ArithmeticException,IOException
   {
	   if(val==0)
          throw new ArithmeticException(); 
	   System.out.println(data/val);
	   
	  // throw new IOException();
   }

}

public class CheckedOverriding4 {

}
