/*
 * 12.Implement a recursive function to find the nth Fibonacci number. The nth Fibonacci number is defined as the sum of the (n-1)th and (n-2)th Fibonacci numbers, with the first two numbers being 0 and 1.
 */
package reccuression.com;

public class Fib 
{
	public static int a=0;
	public static int b=1;
	public static int c=0;
	public static void isFib(int n)
	{
		if(n>=1)
		{
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
			isFib(n-1);
		}
	}
	public static void main(String[] args) 
	{
		int n=10;
		System.out.println("Fibonacii Series upto "+n+"");
		isFib(n);
	}
}
