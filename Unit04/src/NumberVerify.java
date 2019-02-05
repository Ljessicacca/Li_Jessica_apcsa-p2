//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jessica Li 
//Date - 2/5/19
//Class - P2
//Lab  - Odd or Even

import static java.lang.System.*;

public class NumberVerify
{
	public static boolean isOdd( int num )
	{
		if (num % 2 == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isEven( int num )
	{
		if (num % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}	
}