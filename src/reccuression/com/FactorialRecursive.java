package reccuression.com;

public class FactorialRecursive 
{
	public static int f=1;
	public static void isFact(int n)
	{
		if(n>=1)
		{
			f*=n;
			isFact(n-1);
		}
	}
	public static void main(String[] args) 
	{
		int n=4;
		isFact(n);
		System.out.println("Fatcorial of "+n+" is: "+f);
	}
}
