package org.tnsindia.lamdaexpdemo;

public class FunctionalInterfaceExampleExecutor {

	public static void main(String[] args) {
		FunctionalInterfaceExample obj=(int a,int b)->
		{
			int result=(a>b)?a:b;
			
			//System.out.println("The maximum number is:" +result);
			return result;
			
		};
		System.out.println("The maximum number is:" +obj.max(35, 90));

	}

}