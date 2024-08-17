/*
 * 3. Write a recursive Java method to compute the sum 
 * of all even numbers up to a given number N.

 */
package reccuression.com;

public class SumOfEvenNum 
{
	static int cnt=0;
	static int sum=0;
	static int rem=0;
	
	public static void isEven(int n)
	{
		
		cnt++;
		if(n!=0)
		{
			rem=n%10;
			if(rem%2==0)
			{
				System.out.print("\nEven:\n"+rem);
				sum+=rem;
			}
			isEven(n=n/10);
		}
	}
	public static void main(String[] args) 
	{
		int n=12345;
		System.out.println(n);
		isEven(n);
		System.out.println("\nsum of given even is: "+sum);
	}
}
