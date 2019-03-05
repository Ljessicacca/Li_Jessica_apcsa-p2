//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jessica Li 
//Date - 2/25/19

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{ 
		int total = 0;
		
		for (int i = 1; i < ray.size(); i++)
		{
			if (ray.get(0)<ray.get(i))
			{
				total += ray.get(i);
			}
		}
		
		if ((ray.size() < 1 || total == 0))
		{
			total = -1;
		}
		return total;
	
	}
}