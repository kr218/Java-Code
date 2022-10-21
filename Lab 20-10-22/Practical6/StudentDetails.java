package Practical6;

import java.util.*;

public class StudentDetails {
	
	

		public static void main(String[] args) {
			ArrayList<String> numlist = new ArrayList<String>();
			
			numlist.add("Student 1");
			numlist.add("Student 2");
			numlist.add("Student 3");
			numlist.add("Student 4");
			numlist.add("Student 5");
			numlist.add("Student 6");
			
			ListIterator<String> stud = numlist.listIterator();
			
			
			while(stud.hasNext()) {
				System.out.println(stud.next());
			}
			System.out.println();
			
			
			while(stud.hasPrevious()) {
				System.out.println(stud.previous());
			}
		}
	}

