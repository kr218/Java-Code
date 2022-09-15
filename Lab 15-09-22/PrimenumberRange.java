//Practical 2.
import java.util.Scanner;
public class PrimenumberRange{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number to Find the PrimeNumbers beteween them : ");
		int n1 = sc.nextInt();
		int n2= sc.nextInt();

		System.out.print("Prime Numbers between "+n1+" and "+n2+" are : ");
		

		int n;
		for(int i = n1 ; i <= n2 ; i++)
		{
			
			n = 0;
			for(int j = 1 ; j <= i ; j++)	
			{
				if(i % j == 0)
					n = n+1;
			}
			if(n == 2)
				System.out.print(i + ",");
				
	}
}
}