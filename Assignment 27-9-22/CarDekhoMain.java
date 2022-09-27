package javacode;

public class CarDekhoMain {

	public static void main(String[] args) {
		
		CarDekho c = new Tata();
		c.title();
		
		if (c instanceof Tata)
		{
			((Tata)c).name();
		}
		
		c.start();
		c.move();
		c.stop();
		
		if (c instanceof Tata)
		{
			((Tata)c).milege();
		}
		
		CarDekho c1 = new Mahindra();
		
		if (c1 instanceof Mahindra)
		{
			((Mahindra)c1).name();
		}
		
		c1.start();
		c1.move();
		c1.stop();
		
		if (c1 instanceof Mahindra)
		{
			((Mahindra)c1).milege();
		}
		
		
	}

}
