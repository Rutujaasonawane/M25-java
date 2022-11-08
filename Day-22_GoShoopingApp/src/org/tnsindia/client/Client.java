package org.tnsindia.client;

import org.tnsindia.application.GSNormalAcc;
import org.tnsindia.application.GSPrimeAcc;
import org.tnsindia.application.GSShopFactory;
import org.tnsindia.framework.NormalAcc;
import org.tnsindia.framework.PrimeAcc;
import org.tnsindia.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(85642135, "Rutuja Sonawane", 950, true);
		NormalAcc n=new GSNormalAcc(6521431, "Neha Patil", 950,40 );
		
		System.out.println("Prime Account Details: ");
		p.bookProduct(p.getCharges());
		
		System.out.println();
		System.out.println("Normal Account Details: ");
		n.bookProduct(n.getCharges());
		
		//System.out.println(p);
		//System.out.println(n);


	}

}