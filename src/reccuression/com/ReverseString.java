
package reccuression.com;

public class ReverseString 
{
	static int l;
	ReverseString(int l)
	{
		ReverseString.l=l;
	}
	public void isReverse(String str)
	{
		if(l>0)
		{
			System.out.println(str.charAt(--l));
			isReverse(str);
		}
	}
	public static void main(String[] args)
	{
		String str="Java";
		int l=str.length();
		ReverseString r = new ReverseString(l);
		r.isReverse(str);
	}

}
