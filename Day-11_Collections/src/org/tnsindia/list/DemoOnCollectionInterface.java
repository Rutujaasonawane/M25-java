package org.tnsindia.list;

import java.util.ArrayList;
import java.util.Collection;

//Demo on Collection Interface
public class DemoOnCollectionInterface {

	public static void main(String[] args) {
		Collection obj=new ArrayList<>();
		//adding the values
		obj.add("Rutuja");
		obj.add('S');
		obj.add(89.40f);
		System.out.println("The elements in collections are: "+obj);

	}

}
