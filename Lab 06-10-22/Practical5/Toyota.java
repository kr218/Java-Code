package javacode;

public class Toyota extends CarDekho {
	
	
	void name()
	{
		System.out.println("Name : Toyota Urban Cruiser ");
	}
	
	@Override
	void start()
	{
		System.out.println("It have Push Start button ");  
	}
	@Override
	void move()
	{
		System.out.println("It goes 0-100 in 5sec");
	}
	@Override
	void stop()
	{
		System.out.println("It have Push stop button");
	}
	void milege()
	{
		System.out.println("Milege : 11kmpl");
	}
}
