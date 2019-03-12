//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;
	private int size; 

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		pups = new Dog[size]; 
	}
	
	public void set(int spot, int age, String name)
	{
		for (int i = 0; i < pups.length; i++)
		{
			pups[spot] = new Dog(age, name);
		}
		
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
		int max = 0;
		int index = 0;
		
		for (int i = 0; i < pups.length; i++)
		{
			if (pups[i].getAge() > max)
			{
				max = pups[i].getAge();
				index = i;
			}
		}
		return pups[index].getName();
	}

	public String getNameOfYoungest()
	{
		int min = 0;
		int index = 0;
		
		for (int i = 0; i < pups.length; i++)
		{
			if (pups[i].getAge() < min)
			{
				min = pups[i].getAge();
				index = i;
			}
		}
		return pups[index].getName();
	}

	public String toString()
	{
		return "" + Arrays.toString(pups);
	}
}