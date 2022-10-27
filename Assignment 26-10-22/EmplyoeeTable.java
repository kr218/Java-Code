package Assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EmplyoeeTable {
	
		public static void main(String[] args) {
			
	        String emp_details= "ID:22011 , Name:Rajnish kumar , Salary:$100";
	        
	        try {
	        	
	        	   File emp1 = new File("C:\\Users\\Rahul\\emps.txt");
	               if (emp1.createNewFile()) 
	               {
	                 System.out.println("File created: " + emp1.getName());
	               } 
	              
	               FileWriter fWriter = new FileWriter("C:\\Users\\Rahul\\emps.txt");
	               fWriter.write(emp_details);
	               System.out.println(emp_details);
	               fWriter.close();
	               System.out.println("File is created successfully .");
	            }
	            catch (IOException e) 
	            {
	              System.out.print(e.getMessage());
	            }
	        }
	    }
		
