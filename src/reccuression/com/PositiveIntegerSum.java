package reccuression.com;

import java.util.Arrays;

public class PositiveIntegerSum 
{

	static int sum=0,rem=0,cnt=0;
	public static void isPosi(int n[])
	{
		if(cnt<n.length-1)
		{
			if(n[cnt]>0)
			{
				System.out.println(n[cnt]+" ");
				sum+=n[cnt];
			}
			cnt++;
			isPosi(n);
		}
	}
	public static void main(String[] args) 
	{
		int n[]= {-1,-2,4,6,7,8,-9};
		System.out.println("Given number is: "+Arrays.toString(n));
		System.out.println("Given Positive number is: ");
		isPosi(n);
		System.out.println("\nSum of Positive number is: "+sum);
	}


}
