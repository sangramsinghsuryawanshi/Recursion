package reccuression.com;

import java.util.Scanner;

public class Fibonaci
{
	static int a=0,b=1,c;
	public static void isFibonaci(int n)
	{
		if(n>=1)
		{
			c=a+b;
			System.out.print(a+" ");
			a=b;
			b=c;
			isFibonaci(n-1);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number: ");
		int n=sc.nextInt();
		isFibonaci(n);
	}

}
