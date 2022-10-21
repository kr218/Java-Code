package Practical1;



public class GetSet {
	
	public static void main(String[] args) {
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		t1.start();
		t2.start();
		t1.setName("Name 1");
		t2.setName("Name 2");
		System.out.println("After chaning the name of t1 : " + t1.getName());
		System.out.println(t2.getName());
	}
	
}