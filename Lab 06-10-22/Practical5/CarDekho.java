package javacode;

public abstract class CarDekho {
	
	
	void title()
	{
		System.out.println(" !!! WELCOME to CarDekho !!!");
	}
	
	abstract void start();
	
	
	abstract void move();
	
	abstract void stop();
	
	void display()
	{
		System.out.println("All car start When you start it  ");
		System.out.println("All car Move When you Move it  ");
		System.out.println("All car stop When you stop it  ");
	}
	
}
