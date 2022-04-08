package com.capg.day7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

 

public class Sorting {

	public static void main(String[] args) {
		ArrayList<Integer> ls = new ArrayList<Integer>();
        // add method of list
        ls.add(15);
        ls.add(20);
        ls.add(10);
        ls.add(100);
        ls.add(35);
        
        Collections.sort(ls,Collections.reverseOrder());

        System.out.println(ls.contains(101));

        

        System.out.println(ls.equals(35));
        System.out.println(ls.get(0));
        ls.forEach(System.err::println);

        

        // it will take the value and return the index of element or false
        // if index is not found return -1
        //System.out.println("index of 15  :" + ls.indexOf(35));

 

        // it will list is empty or not
        System.out.println(ls.isEmpty());

 

        // print the value
        System.out.println(ls);

 

        Iterator<Integer> it = ls.iterator();
        while (it.hasNext()) {
            System.out.println("it "+it.next());
        }
        //
        
        //size of list
        ls.size();
        
        //update the value using index
        ls.set(0, 200);
        
        System.out.println(ls);

 

         
           
    }

 


 
	

	}


