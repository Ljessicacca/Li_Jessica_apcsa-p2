//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jessica Li 
//Date - 2/5/19
//Class - P2
//Lab  - Discount

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	//instance variables and constructors could be used, but are not really needed
	
	//getDiscountedBill() will return final amount of the bill
	//			if the bill is >2000, the bill receives a 15% discount
	// 			if the bill is less than 2000, no discount is given
	public static double getDiscountedBill(double bill)
	{
		if (bill >= 2000)
		{
			return bill*0.75;
		}
		else
		{
			return 0;
		}
	}
}