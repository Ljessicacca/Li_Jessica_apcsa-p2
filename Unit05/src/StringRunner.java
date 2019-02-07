//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jessica Li 
//Date - 2/5/19
//Class - P2
//Lab  - Odd or Even String

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		
		System.out.println("Enter a word :: ");
		Scanner keyboard = new Scanner(System.in);
		String word = keyboard.nextLine();
		
		StringOddOrEven str = new StringOddOrEven();
		str.isEven();
		str.setString(word);
		
		System.out.println(word + " is " + str.toString());
	}
}