package javacode;

public class Tata extends CarDekho {
	
	void name()
	{
		System.out.println("Name : Harrier ");
	}
	
	@Override
	void start()
	{
		System.out.println("It have Push Start");  
	}
	@Override
	void move()
	{
		System.out.println("It goes 0-100 in 10sec");
	}
	@Override
	void stop()
	{
		System.out.println("It have Push stop");
	}
	void milege()
	{
		System.out.println("Milege : 20kmpl");
	}
}
