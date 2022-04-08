package com.capg.day7;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
public class MyMap
{
	public static void main(String [] args)

	{
		HashMap<Integer,Student> map=new HashMap<Integer,Student>();
		
		Car c1=new Car(1001,"Skoda","black");
		map.put(1, c1);
		
		Car c2=new Car(1002,"Suzuki","White");
		map.put(2, c2);
		
		Car c3=new Car(1003,"BMW","black");
		map.put(3, c3);
		
		Car c4=new Car(1004,"Vistara","Grey");
		
		System.out.println(map);
		


}


