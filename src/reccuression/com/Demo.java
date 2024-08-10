package reccuression.com;

public class Demo 
{
	static int isRe(int a)
	{
		if(a==1)
			return 1;
		else
		return a*isRe(a-1);
	}
	public static void main(String[] args) 
	{
		int a = isRe(5);
		System.out.println(a);
	}	
}
