package com.capg.day7;

public class Vector 
{

}mport java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

 


//Create A list of integer 
//Create A list of String
//Create A list of Double

 

//Insert , Update ,Delete , Sort the element 
//Search by element and index 

 

public class MyList {

 

    public static void main(String[] args) {

 

        //Stack<Integer> ls = new Stack<Integer>();
        
        //Not is not thread Safe byt vector is thread safe
        Vector<Integer> ls = new Vector<Integer>();
        // add method of list
        ls.add(15);
        ls.add(20);
        ls.add(10);
        ls.add(100);
        ls.add(35);
        
        Collections.sort(ls,Collections.reverseOrder());

 

        // delete all the element of list
        // ls.clear();
        
        //it takes the index value and remove the element
        //ls.remove(0);
        
        //ls.re
        
        // it will search for element in list
        // if element is present (true)
        // if element is not there it return the flase
        System.out.println(ls.contains(101));

 

        System.out.println(ls.equals(35));

 

        // it will take the index value and print the element
        // System.out.println(ls.get(0));

 

        // java 8
        // most to print value
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

 

         
        //linked List method
      //  ls.addFirst(1);
       // ls.addLast(1000);
        
        System.out.println(ls);
      //linked List method
        /*
         * Iterator<Integer> rit=ls.descendingIterator(); while(rit.hasNext()) {
         * System.out.println(rit.next()); }
         */
       
       //it will give me the first element
      //System.out.println(ls.getFirst());
      
      //ls.get lst
     // System.out.println(ls.getLast());
      
      //adding the element to tail (last element)
     // ls.offer(10001);
      System.out.println(ls);
      //
     // ls.offerFirst()
      //
      //ls.offerLast()
      
      //it will return the head node
     // System.out.println(ls.peek());
      
      //return the first
     // System.out.println(ls.peekFirst());
      
    //  System.out.println(ls.peekLast());
      
      
      //it will return and remove element also
     // System.out.println(ls.poll());
    //  System.out.println(ls.pollFirst());
    //  System.out.println(ls.pollLast());
    //  System.out.println(ls);
      
    //  ls.removeFirst();
    //  ls.removeLast();
      
      
      //stack methods(SP(=)
    //it will return the head node
   //   System.out.println(ls.peek());
      
    //  ls.push(101);
      System.out.println(ls);
      
   //   ls.pop();
      
      System.out.println(ls);
      
      //ls.
      
      
    //  ls.
    }

 

}
 
