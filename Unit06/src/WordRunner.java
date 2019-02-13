//(c) A+ Computer Science
//www.apluscompsci.com
//Name Jessica Li

import static java.lang.System.*;
import java.util.Scanner; 

public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		Word wordHere = new Word("");
		
		wordHere.setString("Hello");
		System.out.println(wordHere.toString());
		
		wordHere.setString("World");
		System.out.println(wordHere.toString());
		
		wordHere.setString("Jukebox");
		System.out.println(wordHere.toString());
		
		wordHere.setString("TCEA");
		System.out.println(wordHere.toString());
		
		wordHere.setString("UIL");
		System.out.println(wordHere.toString());
	}
}