package javacode;

public class Mahindra extends CarDekho {
	
	void name()
	{
		System.out.println("Name : Scorpio N ");
	}
	
	
	
	@Override
	void start()
	{
		System.out.println("It start when you ON ignition by Key");  
	}
	@Override
	void move()
	{
		System.out.println("It goes 0-100 in 15sec");
	}
	@Override
	void stop()
	{
		System.out.println("Simply of ignition by key");
	}
	
	void milege()
	{
		System.out.println("Milege : 25kmpl");
	}
}
