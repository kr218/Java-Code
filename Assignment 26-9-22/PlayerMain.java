package javacode;

public class PlayerMain {

	public static void main(String[] args) {
		
		Player p = new Cricketer();
		p.Stadium();
		p.Jarsey();
		p.Fees();
		
		Player p1 = new Footballer();
		p1.Stadium();
		p1.Jarsey();
		p1.Fees();
		
		if (p1 instanceof Cricketer)
		{
			((Cricketer)p).BatBall();
		}
		
		if (p1 instanceof Cricketer)
		{
			((Footballer)p1).Ball();
		}
		
	}
}