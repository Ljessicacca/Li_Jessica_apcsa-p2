//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jessica Li 
//Date - 2/5/19
//Class - P2
//Lab  - Odd or Even

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		System.out.println("Enter a whole number :: ");
		Scanner keyboard = new Scanner(System.in);
		int number = keyboard.nextInt();
		System.out.println(number + " is odd :: " + NumberVerify.isOdd(5));
		System.out.println(number + " is even :: " + NumberVerify.isEven(5));
		
	}
}