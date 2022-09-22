package pract_2;

public class Airbus320 extends Boeing747 {
	

	@Override
	void Price() {
		System.out.println(name +"  Ticket price  is slightly on higer side ");
	}
	@Override
	void Travelling() {
		System.out.println(name +"carry 520 passenger at a time as compare to Boeing747 ");
	}
}