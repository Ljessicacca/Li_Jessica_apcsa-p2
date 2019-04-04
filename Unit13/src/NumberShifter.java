//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] output = new int[size];
		//int[]  = Enumerable.Range(1, 10).ToArray();
		for (int i = 0; i < output.length; i++)
		{
			output[i] = (int)(Math.random() * 10 + 1);
		}
		return output;
	}
	public static void shiftEm(int[] array)
	{
		int i = 1;
		while (i < array.length)
		{
			int j = i; 
			while (j > 0 && array[j-1] != 7 && array[j] == 7)
			{
				int k = array[j-1];
				array[j-1] = array[j];
				array[j] = k;
				j--;
			}
			i++;
		}
	}
}