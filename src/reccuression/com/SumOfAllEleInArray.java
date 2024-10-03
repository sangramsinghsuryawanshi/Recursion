/*
 *  Q2.Create a recursive function to 
 *  find the sum of all elements in an array of integers in Java.
 */
package reccuression.com;
import java.util.Arrays;

public class SumOfAllEleInArray 
{
	static int cnt=0;
	static int sum=0;
	public static void isSumAll(int a[])
	{
		if(cnt<=a.length-1)
		{
			sum+=a[cnt++];
			isSumAll(a);
		}
	}
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6};
		System.out.println("Given Array is: "+Arrays.toString(a));
		isSumAll(a);
		System.out.println("Sum: "+sum);
	}
}
