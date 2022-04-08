package com.capg.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListString {

	public static void main(String[] args)
	{
		ArrayList<String> ls = new ArrayList<String>();
       
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
        System.out.println(ls.isEmpty());
        System.out.println(ls);

 

        Iterator<String> it = ls.iterator();
        while (it.hasNext()) {
            System.out.println("it "+it.next());
        }
        
        
        ls.size();
        
        ls.set(0, 200);
        
        System.out.println(ls);

	}
}
