//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class WordPrinter
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printWord(String word, int times)
	{
		int count = times; 
		String words = word; 
		
		for (int i = 0; i < count; i++)
		{
			System.out.println(words);
		}
		
	}
}