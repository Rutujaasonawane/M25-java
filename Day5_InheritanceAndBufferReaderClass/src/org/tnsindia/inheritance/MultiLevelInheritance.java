package org.tnsindia.inheritance;


class Vehicle
{
	protected String name="car";
	public void display0()
	{
		System.out.println("name");
	}
}

//child class for vehicle
class BMW extends Vehicle
{
	protected String name1="BMW";
	public void display() 
	{
		System.out.println(name1);
	}
}
//child class for BMW
class Tyre extends Vehicle
{
	protected String name2="Bridgestone";
	public void display2()
	{
		System.out.println(name2);
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		Tyre t=new Tyre();
		t.display0();;
		t.display2();
	}

}
