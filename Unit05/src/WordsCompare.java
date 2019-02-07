//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jessica Li 
//Date - 2/7/19
//Class - P 2 
//Lab  - Dictionary

import static java.lang.System.*;

public class WordsCompare
{
	private String wordOne, wordTwo;
    private int compare;

	//public WordsCompare()
	//{
		
	//}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public WordsCompare(String one, String two)
	{
		this.setWords(one, two);
		
	}
	
	public void compare()
	{
		compare = wordOne.compareTo(wordTwo);
	}

	public String toString()
	{
		this.compare();
		if(compare<0)
		{
			//System.out.println(compare);
			return wordOne + " should be placed before " + wordTwo + "\n";
		}
		else
		{
			//System.out.println(compare);
			return wordOne + " should be placed after " + wordTwo + "\n";
		}
	}
}