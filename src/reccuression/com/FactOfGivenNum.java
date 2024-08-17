package reccuression.com;

public class FactOfGivenNum 
{
	static int fact=1;
	public static int isFac(int n)
	{
		if(n>1)
		{
			fact*=n;
			isFac(n-1);
		}
		return fact;
	}
	public static void main(String[] args) 
	{
		int n=6;
		System.out.println("Factorial of given "+n+" is: "+isFac(n));
	}
}
