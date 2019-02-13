//(c) A+ Computer Science
//www.apluscompsci.com
//Name Jessica Li

import static java.lang.System.*;

public class TriangleOne
{
	private String word;
	private String str;
	private int length; 

	public TriangleOne()
	{
		word = " ";
	}
	
	public void setWord(String s)
	{
		word = s;
		length = word.length();
		str = "";
	}

	public TriangleOne(String s)
	{
		this.setWord(s);
	}

	public void print( )
	{
		for(int i = 0; i <= word.length(); i++)
		{
			str = str + word.substring(0,  length) + "\n";
			length = length - 1;
		}
	}
	
	public String toString()
	{
		for (int i = 0; i <= word.length(); i++)
		{
			this.print();
			return str; 
		}
		return str; 
	}
}