//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public void WordsCompare(String one, String two)
	{
		this.setWords(one, two);
		
	}

	public boolean checkEquality( )
	{
		if (wordOne.equals(wordTwo))
			return true;
		return false;
	}

	public String toString()
	{
		if (checkEquality())
			return wordOne + " has the same letters or order as " + wordTwo + "\n";
		return wordOne + " does not have the same letters or order as " + wordTwo + "\n";
	}
}