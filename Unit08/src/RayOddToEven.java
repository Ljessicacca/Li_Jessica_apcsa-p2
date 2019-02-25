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
		int indexOn = 0; 
		
		while (oddIndex == 0)
		{
			if (ray[indexOn] % 2 != 0)
			{
				oddIndex = indexOn;
				if (indexOn < ray.length -1)
				{
					indexOn ++;
					break;
				}
				else
				{
					if (indexOn < ray.length -1)
					{
						indexOn ++;
					}
				}
			} 
		}
		while (evenIndex == 0)
		{
			if (ray[indexOn] % 2 != 0)
			{
				evenIndex = indexOn;
				if (indexOn < ray.length -1)
				{
					indexOn ++;
					break;
				}
				else
				{
					if (indexOn < ray.length -1)
					{
						indexOn ++;
					}
				}
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

