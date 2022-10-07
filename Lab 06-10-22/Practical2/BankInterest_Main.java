package Practical2;

public class BankInterest_Main {

	public static void main(String[] args) {
		
		BankInterests b = new BankOfBaroda();
		BankInterests b1 = new AxisBank ();
		BankInterests b2 = new UnionBank();
		BankInterests b3 = new  StateBank();
		BankInterests b4 = new  ICICI();
		b.title();
		b.interest();
		b1.interest();
		b2.interest();
		b3.interest();
		b4.interest();

	}

}
