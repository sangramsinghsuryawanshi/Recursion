package reccuression.com;

public class Pallindrome 
{
	static int rev=0;
	static int rem=0;
	static int isPal(int num)
	{
		if(num<=0)
		{
			return rev;
		}
		else
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
			return isPal(num);
		}
	}
	public static void main(String[] args) 
	{
		if(isPal(123)==rev)
		{
			System.out.println("Given is palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}
}
