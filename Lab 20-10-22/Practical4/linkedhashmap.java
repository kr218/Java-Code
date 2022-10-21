package Practical4;

import java.util.*;

public class linkedhashmap {


	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		
		// Insertion
		lhm.put(1, "Name 1");
		lhm.put(2, "Name 2");
		lhm.put(3, "Name 3");
		System.out.println("Insertion: ");
		for(Map.Entry m: lhm.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}
		System.out.println();
		
		// Updation
		lhm.replace(1, "Name A");
		lhm.replace(2, "Name B");
		lhm.replace(3, "Name C");
		System.out.println("Updation: ");
		for(Map.Entry m: lhm.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}
		System.out.println();
		
		// Deletion
		lhm.remove(1);
		lhm.remove(2);
		lhm.remove(3);
		System.out.println("Deletion: ");
		for(Map.Entry m: lhm.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}
	}

}
