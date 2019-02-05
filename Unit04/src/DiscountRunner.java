//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jessica Li 
//Date - 2/5/19
//Class - P2
//Lab  - Discount


import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		System.out.println("The final bill after discount will be " + Discount.getDiscountedBill(amt));

	}
}