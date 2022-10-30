package org.tnsindia.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String>obj=new HashMap<>();
		
		//1.Key can't be duplicated but value can be duplicated
		//2.it follows the sorting order
		obj.put(1,"Rutuja");
		obj.put(4,"Rohan");
		obj.put(1,"Rohit");
		obj.put(2,"Rajiv");
		obj.put(null, null);
		obj.put(5, null);
		System.out.println(obj);
		obj.remove(1);
		System.out.println(obj);
		//to extract the pairs from map
		for(Map.Entry m:obj.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
