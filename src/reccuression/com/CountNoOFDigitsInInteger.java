/*
 * 4. Write a Java method to count the number of digits in an integer using recursion.

 */
package reccuression.com;

public class CountNoOFDigitsInInteger 
{
	static int cnt=0;
	static int rem=0;
	public static void isCnt(int n)
	{
		if(n!=0)
		{
			rem=n%10;
			isCnt(n=n/10);
			cnt++;
		}
	}
	public static void main(String[] args) 
	{
		int n=123456463;
		System.out.println("Given Integer: "+n);
		isCnt(n);
		System.out.println("Count of given integer is: "+cnt);
	}

}
