package Practical3;

public class Threading implements Runnable{
	
	
		int tickets = 5;
	    static int i = 1, j = 2, k = 3;
	    public void bookticket (String name, int bookedtickets)
	    {
	        if (bookedtickets <= tickets)
	        {
	            System.out.println (bookedtickets + " booked to " + name);
	            tickets = tickets - bookedtickets;
	        }
	        else
	        {
	            System.out.println ("No tickets to book");
	        }
	    }
	    public void run ()
	    {
	        String name = Thread.currentThread ().getName ();
	        if (name.equals ("A"))
	        {
	            bookticket (name, i);
	        }
	        else if (name.equals ("B"))
	        {
	            bookticket (name, j);
	        }
	        else
	        {
	            bookticket (name, k);
	        }
	    }
	    public static void main (String[]args)
	    {
	    	Threading t = new Threading ();
	        Thread t1 = new Thread(t);
	        Thread t2 = new Thread(t);
	        Thread t3 = new Thread(t);
	        t1.setName ("A");
	        t2.setName ("B");
	        t3.setName ("C");
	        t1.start ();
	        t2.start ();
	        t3.start ();
	    }

	}
