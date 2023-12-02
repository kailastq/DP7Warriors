//WAP to print all elements of ArrayList using iterator
package com.ArrayListAssign;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Pineapple");

        Iterator<String> itr = list.iterator();

        
        while (itr.hasNext()) 
        {
            String str = itr.next();
            System.out.println(str);
        }
    }
}
