package reccuression.com;

import java.util.Scanner;

public class Factorial 
{
	static int fact=1;
	public static int isFact(int n)
	{
		if(n>1)
		{
			fact*=n;
			isFact(--n);
		}
		return fact;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number: ");
		int n=sc.nextInt();
		System.out.println("Factorial of "+n+" is: "+isFact(n));
	}

}
