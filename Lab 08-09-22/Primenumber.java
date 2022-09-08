// Program to Check Number is Prime or Not

import java.util.Scanner;
class Primenumber{
	
     static boolean checknumber()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter  Number to Check the Number is Prime or Not: ");
	int n=sc.nextInt();
	
	if (n<=1)
	    {
		return false;
            }
 	for(int i=2;i<=n/2;i++)
	   {
              if((n%i)==0)
		return false;
	   }
          return true ;
   	}
	
      public static void main(String[] args){
	
	if(checknumber())
	   {
		System.out.print("Given number is Prime number");
	   }
	else
	   {
                System.out.print("Given number is not prime ");
	   }
		
		
}
}
	         