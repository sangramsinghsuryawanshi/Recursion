package reccuression.com;

public class Fibonacii 
{
	static int a=0,b=1,c;
	public static void isFi(int n)
	{
		if(n>=1)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			isFi(n-1);
		}
	}
	public static void main(String[] args) 
	{
		int n=10;
		System.out.println("Fibonacii Series upto "+n+":");
		isFi(n);
	}
}
