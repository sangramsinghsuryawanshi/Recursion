/*
 * 5. Write a recursive Java method to compute the 
 * sum of all odd numbers up to a given number N.

 */
package reccuression.com;

public class SumOfAllOddNum 
{
	static int sum=0,rem=0;
	public static void isOdd(int n)
	{
		if(n!=0)
		{
			rem=n%10;
			if(rem%2!=0)
			{
				System.out.print(rem+" ");
				sum+=rem;
			}
			isOdd(n=n/10);
		}
	}
	public static void main(String[] args) 
	{
		int n=123456789;
		System.out.println("Given n number is: "+n);
		System.out.println("Given Odd number is: ");
		isOdd(n);
		System.out.println("\nSum of odd number is: "+sum);
	}

}
