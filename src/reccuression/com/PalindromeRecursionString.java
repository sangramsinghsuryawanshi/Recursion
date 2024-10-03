package reccuression.com;

import java.util.Scanner;

public class PalindromeRecursionString 
{
	public static String isPal(String str)
	{
		if(str.length()<=1)
		{
			return "Given String is Palindrome";
		}
		if(str.charAt(0)!=str.charAt(str.length()-1))
		{
			return "Given String is not Palindrome";
		}
		return isPal(str.substring(1,str.length()-1));
	}
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String pal=sc.next();
		System.out.println(isPal(pal));
		sc.close();
	}
}