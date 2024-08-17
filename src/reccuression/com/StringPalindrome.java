package reccuression.com;

public class StringPalindrome 
{
	public static String isPal(String s)
	{
		if(s.length()<=1)
		{
			return "Given String is palindrome";
		}
		if(s.charAt(0)!=s.charAt(s.length()-1))
		{
			return "Given String is not palindrome";
		}
		return isPal(s.substring(1, s.length()-1));
	}
	public static void main(String[] args) 
	{
		String str="madam";
		System.out.println(isPal(str));

	}

}
