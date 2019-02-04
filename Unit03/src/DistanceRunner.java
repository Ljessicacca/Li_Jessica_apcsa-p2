//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jessica Li 
//Date - 2/4/19
//Class - P3
//Lab  - Distance Formula

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;


public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		
		int x1, x2, y1, y2;
		System.out.println("Enter x1 :: ");
		x1 = keyboard.nextInt();
		System.out.print("Enter x2 :: ");
		x2 = keyboard.nextInt();
		System.out.print("Enter y1 :: ");
		y1 = keyboard.nextInt();
		System.out.print("Enter y2 :: ");
		y2 = keyboard.nextInt();
		
		Distance dis1 = new Distance();
		dis1.setCoordinates(x1, y1, x2, y2);
		System.out.println(dis1.toString());
	}
}