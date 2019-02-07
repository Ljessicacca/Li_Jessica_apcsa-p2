//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jessica Li 
//Date - 2/5/19
//Class - P2
//Lab  - Odd or Even String

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		word = " ";
	}
	
	public void setString(String s)
	{
		word = s;
	}
	
	/*public StringOddOrEven(String word)
	{
		
		}
	}*/


 	public boolean isEven()
 	{
 		int length = word.length();
		if (length % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

 	public String toString()
 	{
 		String output;
 		if (isEven())
 			output = "even";
 		else
 			output = "odd";
 		return output;
	}
}