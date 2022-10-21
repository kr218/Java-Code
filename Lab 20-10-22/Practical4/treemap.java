package Practical4;


import java.util.*;

public class treemap {
	 

		public static void main(String[] args) {
			TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
			// Insertion
			tmap.put(1, "A");
			tmap.put(2, "B");
			tmap.put(3, "C");
			tmap.put(4, "D");
			System.out.println("Insertion: ");
			for(Map.Entry m: tmap.entrySet()){  
				   System.out.println(m.getKey()+" "+m.getValue());  
			}
			System.out.println();
			
			// Updation
			tmap.replace(3, "Small c");
			tmap.replace(4, "Small d");
			System.out.println("Updation: ");
			for(Map.Entry m: tmap.entrySet()){  
				   System.out.println(m.getKey()+" "+m.getValue());  
			}
			System.out.println();
			
			// Deletion
			tmap.remove(2);
			tmap.remove(4);
			System.out.println("Deletion: ");
			for(Map.Entry m: tmap.entrySet()){  
				   System.out.println(m.getKey()+" "+m.getValue());  
			}
			System.out.println();
		}

	}
