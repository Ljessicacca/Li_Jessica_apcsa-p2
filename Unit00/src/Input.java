//(c) A+ Computer Science
//www.apluscompsci.com

//Name Jessica Li
//Date Jan 31 2019
//Class APCSA P2
//Lab  Input Basics

import static java.lang.System.*;
import java.util.Scanner;

public class Input
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;
		
		//input
		// integers 
		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();


		System.out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();


		//doubles 
		System.out.print("Enter a decimal :: ");
		doubleOne = keyboard.nextDouble();


		System.out.print("Enter a decimal :: ");
		doubleTwo = keyboard.nextDouble();
		
		//floats 
		System.out.print("Enter a decimal :: ");
		floatOne = keyboard.nextFloat();


		System.out.print("Enter a decimal :: ");
		floatTwo = keyboard.nextFloat();
		
		//shorts 
		System.out.print("Enter a integer :: ");
		shortOne = keyboard.nextShort();


		System.out.print("Enter a integer :: ");
		shortTwo = keyboard.nextShort();
		

		//output
		//int
		System.out.println();
		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo );
		
		//double
		System.out.println();
		System.out.println("double one = " + doubleOne );
		System.out.println("double two = " + doubleTwo );
		
		//float
		System.out.println();
		System.out.println("float one = " + floatOne );
		System.out.println("float two = " + floatTwo );
		
		//short
		System.out.println();
		System.out.println("short one = " + shortOne );
		System.out.println("short two = " + shortTwo );

	}
}