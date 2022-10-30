package org.tnsindia.setdemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		SortedSet<String> s=new TreeSet<>();
		s.add("Virat");
		s.add("Shubham");
		s.add("Hardik");
		s.add("Rutuja");
		System.out.println("The elements in the TreeSet are: "+s);

	}

}