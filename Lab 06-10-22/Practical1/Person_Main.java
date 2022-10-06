package Practical1;



public class Person_Main {

	public static void main(String[] args) {
		
		
		Person p1 = new Student();
		Person p2 = new Employee();
		
		
		p1.title1();
		p1.person_ID();
		p1.person_name();
		
		if (p1 instanceof Student)
		{
			((Student)p1).marks();
		}
		
		p2.title2();
		p2.person_ID();
		p2.person_name();
		if (p1 instanceof Student)
		{
			((Student)p1).marks();
		}
		
		if (p2 instanceof Employee)
		{
			((Employee)p2).salary();
		}


	}

}
