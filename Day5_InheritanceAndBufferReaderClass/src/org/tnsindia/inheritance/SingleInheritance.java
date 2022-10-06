package org.tnsindia.inheritance;

import java.util.Scanner;

//Demo on single-inheritance
//parent class
class Animal
{
	protected String name;
	public void display()
	{
		System.out.println("The Animal is: "+name);
	}
}
//child class
class Dog extends Animal
{
	public String Breed;
	public void print()
	{
		System.out.println("The Dog Breed is: "+Breed);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		System.out.println("Enter the name of Animal ");
		Scanner s=new Scanner(System.in);
		String name1=s.nextLine();
		System.out.println("Enter the name of Breed ");
		String Breed1=s.nextLine();
		Dog d=new Dog();
		d.Breed=Breed1;
		d.name=name1;
		
		d.display();
		d.print();

	}

}
