//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int odd = 0;
		int even = 0;
		int i = 0;
		while (odd == 0 && i < ray.size())
		{
			if (ray.get(i) % 2 == 1)
			{
				odd = i;
				break;
			}
			i++;
		}
		while (i < ray.size())
		{
			if (ray.get(i) % 2 == 0)
			{
				even = i;
			}
			i++;
		}
		/*for (i = 0; i < ray.size(); i++)
		{
			if (ray.get(i) % 2 == 1)
			{
				odd = i;
				break;
			}
		}
		for (int j = i; j < ray.size(); j++)
		{
			if (ray.get(i) % 2 == 0)
			{
				even = j;
			}
		}*/
		if (even - odd != 0)
			return even - odd;
		else
			return -1;
	}
}