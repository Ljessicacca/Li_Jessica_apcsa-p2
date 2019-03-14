//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList = new ArrayList<Toy>();

	public ToyStore(String toys)
	{
		loadToys(toys);
	}

	public void loadToys( String toys )
	{
		for (String s: toys.split(" "))
		{
			boolean same = false; 
			if (toyList.size() > 0)
			{
				for (Toy toy : toyList)
				{
					if (toy.getName().equals(s))
					{
						toy.setCount(toy.getCount() + 1);
						same = true;
					}
				}
			}
			if (!same)
			{
				toyList.add(new Toy(s));
				getThatToy(s).setCount(1);
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (Toy toy: toyList)
  		{
  			if (toy.getName().equals(nm))
  			{
  				return toy;
  			}
  		}
  		return new Toy(); 
  	}
  
  	public String getMostFrequentToy()
  	{
  		Toy total = toyList.get(0);
  		for (Toy toy: toyList)
  		{
  			if (toy.getCount() > total.getCount())
  			{
  				total = toy;
  			}
  		}
  		return total.getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		boolean a = false; 
  		while (!a)
  		{
  			int b = 0;
  			for (int i = 0; i < toyList.size()-1; i++)
  			{
  				if ((toyList.get(i)).getCount() > toyList.get(i+1).getCount())
  				{
  					toyList.add(i, toyList.get(i+1));
  					toyList.remove(i+2);
  					b++;
  				}
  			}
  			if (b == 0) 
  				a = true; 
  		}
  	}  
  	  
	public String toString()
	{
		//return Arrays.toString(toyList.toArray());
		return toyList + " "; 
	}
}