package Practical2;

import java.util.Scanner;

public class Agent {
	
	
	TicketCounter booking() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the air craft you want to book : ");
		String bk = sc.nextLine();
		sc.close();
		if(bk.equalsIgnoreCase("Indigo"))
		{
			return new Indigo();
		}
		
		else if(bk.equalsIgnoreCase("Spicejet"))
		{
			return new Spicejet ();
		}
		else {
			return null;
		}
		
	}
}
