package org.tnsindia.client;

import org.tnsindia.application.MMBankFactory;
import org.tnsindia.application.MMCurrentAcc;
import org.tnsindia.application.MMSavingAcc;
import org.tnsindia.framework.BankFactory;
import org.tnsindia.framework.CurrentAcc;
import org.tnsindia.framework.SavingAcc;


public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		BankFactory b=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(63581, "Rutuja Sonawane", 20000, true);
		CurrentAcc c=new MMCurrentAcc(859682, "Madhura Boralkar", 20000, 1000);
		System.out.println();
		System.out.println("Saving Account is : "); 
		s.withdraw(s.getAccBal());
		System.out.println();
		System.out.println("Current Account is : "); 
		c.withdraw(c.getAccBal());
		System.out.println();
		System.out.println(s); 
		System.out.println(c); 
	}

}