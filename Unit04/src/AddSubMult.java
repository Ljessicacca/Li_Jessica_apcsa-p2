//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Jessica Li 
//Date - 2/5/19
//Class - P2
//Lab  - Add Subtract Mult

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{
		if (a > b)
		{
			return a-b;
		}
		if (b > a)
		{
			return b-a;
		}
		else 
		{
			return a * b;
		}
		//must always return something; use this or return 0; 
	}
}