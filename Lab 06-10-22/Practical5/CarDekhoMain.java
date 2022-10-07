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
		
		 c = new Mahindra();
		
		if (c instanceof Mahindra)
		{
			((Mahindra)c).name();
		}
		
		c.start();
		c.move();
		c.stop();
		
		if (c instanceof Mahindra)
		{
			((Mahindra)c).milege();
		}
		
		c.display();
		
		

	}

}
