//(c) A+ Computer Science 
//www.apluscompsci.com

//Name - Jessica Li 
//Date - 2/4/19
//Class - P3
//Lab  - Distance Formula

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		//dist = 0;
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		/*x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;*/
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;	
		xTwo = x2;
		yTwo = y2;
				
	}

	public void calcDistance()
	{
		
	}
	
	//the formula for calculating distance
	
	public double getDistance()
	{
		
		return sqrt((((xTwo - xOne)*(xTwo - xOne))+(yTwo-yOne)*(yTwo-yOne)));
	}
	
	public void print()
	{

	}
	
	//complete print or the toString

	public String toString()
	{
		return "Distance == " + getDistance();
	}
}