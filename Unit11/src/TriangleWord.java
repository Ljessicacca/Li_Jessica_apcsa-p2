//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		String output = "";
		String w = word;
		int count = 0;
		while (count <= word.length())
		{
			w = word.substring(0, count);
			for (int i = 0; i < count; i++)
			{
				output = output + w;
			}
			output = output + "\n";
			count++;
		}
		System.out.print(output);
	}
}