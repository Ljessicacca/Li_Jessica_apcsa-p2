//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jessica Li 
//Date - 2/7/19
//Class - P 2 
//Lab  - Str Equality

import static java.lang.System.*;

import java.util.Scanner;

public class StringEqualityRunner
{
   public static void main( String args[] )
   {
		Scanner keyboard = new Scanner(System.in);
		
	    System.out.println("Enter a word :: ");
		String word1 = keyboard.nextLine();
		
		System.out.println("Enter a word :: ");
		String word2 = keyboard.nextLine();
		
		StringEquality str = new StringEquality();
		str.setWords(word1, word2);
		System.out.println(str.toString());
		
		
		
		
	}
}