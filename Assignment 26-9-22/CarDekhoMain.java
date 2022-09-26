package javacode;

public class CarDekhoMain {

	public static void main(String[] args) {
	
		CarDekho c = new Tata();
		CarDekho c1 = new Mahindra();
		CarDekho c2 = new Toyota();
		c.title();
		if (c instanceof Tata)
		{
			((Tata)c).Founder();
			((Tata)c).name();
		}
		c.CompanyName();
		c.Type();
		c.Price();
		
		if (c1 instanceof Mahindra)
		{
			((Mahindra)c1).Founder();
			((Mahindra)c1).name();
		}
		c1.CompanyName();
		c1.Type();
		c1.Price();
		
		if (c2 instanceof Toyota)
		{
			((Toyota)c2).Founder();
			((Toyota)c2).name();
		}
		c2.CompanyName();
		c2.Type();
		c2.Price();
		
		
		
	}

}
