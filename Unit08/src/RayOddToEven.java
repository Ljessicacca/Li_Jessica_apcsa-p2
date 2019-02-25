//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jessica Li
//Date - 2/22/19

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int oddIndex = 0;
		int evenIndex = 0;
		int i = 0; 
		
		while (i < ray.length - 1) 
		{
			if ((ray[i] % 2 != 0) && (oddIndex == 0))
			{
				oddIndex = i; 
				i++;
				break;
			}
			else
			{
				i++;
			}
		}
		
		while (i < ray.length - 1) 
		{
			if ((ray[i] % 2 == 0) && (evenIndex == 0))
			{
				evenIndex = i;
				i++;
				break;
			}
			else
			{
				i++;
			}
		}
		
		if (evenIndex-oddIndex != 0)
		{
			return evenIndex-oddIndex;
		}
		else
		{
			return -1; 
		}
	}
}

