package org.tnsindia.operators;

public class LogicalOperator {

	public static void main(String[] args) {
		int a=3,b=4;
		boolean res=(a<b && b<a);
		boolean res1=(a<b || b>a);
		boolean res2=!(a<b);
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
	
	}

}
