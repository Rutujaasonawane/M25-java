package org.tnsindiauserinput;

import java.util.Scanner;

//program on user input for integer data-type
public class DemoOnInteger {

	public static void main(String[] args) {
		//for user-input
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value of x: ");
		int x=s.nextInt();
		System.out.println("The result is ");
		System.out.println(x);
		s.close();

	}

}
