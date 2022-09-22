package pract_2;

public class Boeing747 extends Airlines {
	String name;
	
	void Price() {
		System.out.println(name +"  Ticket price is worthit");
	}
	@Override
	void Travelling() {
		System.out.println(name +"is Best aircraft for Long Distance");
	}
}