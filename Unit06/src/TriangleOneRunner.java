//(c) A+ Computer Science
//www.apluscompsci.com
//Name Jessica Li

import static java.lang.System.*;
import java.util.Scanner;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		out.println("Please enter a word:: ");
		String s = keyboard.next();
		
		TriangleOne tri = new TriangleOne(s);
		
		System.out.println(tri.toString());
		//add test cases		
	}
}