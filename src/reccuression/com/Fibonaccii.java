package reccuression.com;

public class Fibonaccii 
{
	static int a=0;
	static int b=1;
	static int c=0;
	static void isFabi(int num)
	{
		if(num>0)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			isFabi(num-1);
		}
			
	}
	public static void main(String[] args) 
	{
		isFabi(10);
	}
}
