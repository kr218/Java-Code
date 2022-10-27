package Pract5;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class printWriter {

	

	
		public static void main(String[] args) throws FileNotFoundException {
			File file = new File("C:\\Users\\Rahul\\printwritefile.txt");
			String name = "Name: Rajnishkumar";
			String age = "Age:22 current";
			PrintWriter pw = new PrintWriter(file);
			pw.write(name);
			pw.write(age);
			System.out.println("Content as been written successfully");
			pw.close();
		}
}
