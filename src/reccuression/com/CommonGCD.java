package reccuression.com;

public class CommonGCD 
{
	public static int isGCD(int a,int b)
	{
		if(b==0)
		{
			return a;
		}
		return isGCD(b, a%b);
	}
	public static void main(String[] args) 
	{
		int first=45;
		int second=40;
		System.out.println("First value: "+first+" Second value: "+second);
		System.out.println("GCD Is: "+isGCD(first, second));
	}
}
