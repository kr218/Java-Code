package Practical2;

public class TicketCounter_Main {

	public static void main(String[] args) {
		
		
			
			TicketCounter t = new Agent().booking();
			TicketCheck c = new TicketCheck();
			
			if(t!=null)
			{
				c.check(t);
			}
			else 
			{
				System.out.println("Sorry we have only 2 flight");
			}

		}	
	}
