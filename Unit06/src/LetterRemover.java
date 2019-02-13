//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;


	public LetterRemover(String s, char remove)
	{
		//call set
		setRemover(s, remove);
	}
	//this doesn't do anything
	//add in second constructor
	
	public void setRemover(String s, char remove)
	{
		sentence = s;
		lookFor = remove;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		int loc = cleaned.indexOf(lookFor);
		while (loc > -1)
		{
			cleaned = cleaned.substring(0, loc) + cleaned.substring(loc + 1);
			loc = cleaned.indexOf(lookFor);
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}