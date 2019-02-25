//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jessica Li	
//Date - 2/22/19

public class RayDown
{
	public static boolean go(int[] numArray)
	{
		for (int i = 0; i + 1 < numArray.length; i++)
		{
			if (!(numArray[i] > numArray [i+1]))
			{
				return false;
			}
		}
		return true; 
	}
	public String toString()
	{
		return "s";
	}
}