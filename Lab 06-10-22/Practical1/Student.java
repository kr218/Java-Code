package Practical1;

public class Student extends Person {
	
	@Override
	void person_ID()
	{
		System.out.println("Student ID : 01");
	}
	
	@Override
	void person_name()
	{
		System.out.println("Student Name : Rajnish ");
	}
	
	void marks()
	{
		System.out.println("Student Marks : 50/100");
	}

}
