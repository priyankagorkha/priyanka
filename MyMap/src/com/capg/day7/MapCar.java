package com.capg.day7;

import java.util.HashMap;

public class MapCar {

	public static void main(String[] args)
	{
	HashMap<Integer,Car> map=new HashMap<Integer,Car>();
	
	Car c1=new Car(1001,"Skoda","black");
	map.put(1, c1);
	
	Car c2=new Car(1002,"Suzuki","White");
	map.put(2, c2);
	
	Car c3=new Car(1003,"BMW","black");
	map.put(3, c3);
	
	Car c4=new Car(1004,"Vistara","Grey");
	map.put(4,c4);
	
	System.out.println(map);
	
	
	
	
	

	}

}
