/*
 * 2. Calculate the sum of elements in an integer array 
 * using recursion.

 */
package reccuression.com;

import java.util.Arrays;

public class SumOfEleArray 
{
	static int cnt=0,sum=0;
	public static void isSum(int a[])
	{
		if(cnt<=a.length-1)
		{
			sum+=a[cnt++];
			isSum(a);
		}
		
	}
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		isSum(a);
		System.out.println(Arrays.toString(a));
		System.out.println("Sum of given array is:"+sum);
	}

}
