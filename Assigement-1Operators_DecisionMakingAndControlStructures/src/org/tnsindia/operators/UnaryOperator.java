package org.tnsindia.operators;

public class UnaryOperator {

	public static void main(String[] args) {
		int a=5,b=3,c=22,d=11;
		//increment operator
		int x=a++;
		int y=++b;
		int z=a+x;
		//decrement operator
		int p=c--;
		int q=--d;
		int R=c-p;
		
		System.out.println(z);
		System.out.println(R);


	}

}
