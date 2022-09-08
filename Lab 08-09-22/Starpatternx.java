//Program to print starpattern in Shap of X.
class Starpatternx{
	
	public static void main(String[] args)
	{
	  int n=11; int i; int j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i==j||(j==n-i+1))
				{
				System.out.print("x");
				}
				else
				{
				System.out.print(" ");
				}
			}
	System.out.println();
}
}
}