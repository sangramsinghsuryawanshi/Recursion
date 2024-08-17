package reccuression.com;

public class PrintName 
{
	static int c=0;
	public static void isName()
	{
		c++;
		if(c<=5)
		{
			System.out.println("Hiii Sangram......");
			isName();
		}
	}
	public static void main(String[] args) {
	
		isName();
	}

}
