package Practical5;

import java.util.*;

public class Queued {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();
		// Insertion
		queue.add("Name 1");
		queue.add("Name 2");
		queue.add("Name 3");
		System.out.println("Insert: ");
		Iterator itr1=queue.iterator();  
		while(itr1.hasNext()){  
			System.out.println(itr1.next());  
		}
		System.out.println();
		
		
		queue.remove("Nmae 2");
		queue.poll(); // Remove the head of the queue
		System.out.println(queue.peek());
		System.out.println("Delete: ");
		Iterator itr2=queue.iterator();  
		while(itr2.hasNext()){  
			System.out.println(itr2.next());  
		}
		
	}
}
