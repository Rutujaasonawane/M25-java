package org.tnsindia.customexception;

import java.util.Scanner;

public class UserLoginCustomExceptionExecutorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String id=s.nextLine();
		String password=s.nextLine();
		try {
			if(id!="rutujaasonawane@gmail.com" && password!="RAS@11")
				throw new LoginCredentials("Invalid Credentials");
		}
		catch(LoginCredentials e)
		{
			System.out.println("Exception Handled "+e);
		}
		s.close();

	}
}
