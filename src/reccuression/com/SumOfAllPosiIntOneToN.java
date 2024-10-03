/*
 * Q11.Write a Java function to calculate the sum of all positive integers from 1 to N using recursion.
 */
package reccuression.com;

public class SumOfAllPosiIntOneToN 
{
	public static int sum;
	public static void is(int a)
	{
		if(a<1)
		{
			
		}
		else
		{
			sum+=a;
			is(a-1);
		}
	}
	public static void main(String[] args) 
	{
		int b=20;
		is(b);
		System.out.println("Sum of Positive Integers: "+sum);
	}
}
