package Practical4;

import java.util.*;

public class hashmap {

	public static void main(String[] args) {
		HashMap<Integer, String> numhm = new HashMap<Integer, String>();
		
		
		numhm.put(1, "A");
		numhm.put(2, "B");
		numhm.put(3, "C");
		numhm.put(4, "D");
		System.out.println("Insertion: ");
		for(Map.Entry m:numhm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		}
		System.out.println();
			
		
		numhm.remove(2);
		numhm.remove(4);
		System.out.println("Deletion: ");
		for(Map.Entry m:numhm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		}
		System.out.println();
		
	
		numhm.replace(3, "C1");
		numhm.replace(1, "A1");
		System.out.println("Updation: ");
		for(Map.Entry m:numhm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		}
	}
}