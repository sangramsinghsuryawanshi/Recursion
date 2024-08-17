/*
 * 1.Write a Java function to print numbers from 1 to N using recursion.

 */
package reccuression.com;

public class PrintOneTwoNNumber 
{
	static int cnt=0;
	public static void isN(int n)
	{
		cnt++;
		if(cnt<=n)
		{
			System.out.println(cnt);
			isN(n);
		}
	}
	public static void main(String[] args) 
	{
		int n=10;
		isN(n);

	}

}
