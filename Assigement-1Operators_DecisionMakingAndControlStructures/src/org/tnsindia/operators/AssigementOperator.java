package org.tnsindia.operators;

import java.util.Scanner;

public class AssigementOperator {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			int b=s.nextInt();
			a*=b;//a=a*b
			b%=a;
			System.out.println(a);
			System.out.println(b);
			s.close();
		}

}
