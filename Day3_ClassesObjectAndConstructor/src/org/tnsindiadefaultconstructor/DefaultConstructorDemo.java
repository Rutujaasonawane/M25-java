package org.tnsindiadefaultconstructor;

//class defination
	class Car
	{
		//variable
		public int speed;
		//method
		void display()
		{
			System.out.println("The speed is: "+speed+"km/hr");
		}
		//default constructor
		//Constructor is used to initialize the value of the variables
		Car()
		{
			speed=120;
		}
	}

public class DefaultConstructorDemo {
	public static void main(String[] args) {
		//object creation
		Car obj=new Car();
		//obj.speed=120;
		//calling the method of car class
		obj.display();

	}

	

}
