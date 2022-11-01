package org.tnsindia.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		h.setPin_no(1012);
		System.out.println("The pin of ATM is: "+h.getPin_no());
}
}

	