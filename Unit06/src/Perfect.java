//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jessica Li 

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect() 
   {
	   //setNumber(0);
	   number = 0;

   }
   
   public Perfect(int n) 
   {
	   setNumber(n);
   }

	//add a set method
   	public void setNumber(int n) 
   	{
   		number = n;
   	}

	public boolean isPerfect()
	{
		int total = 0;
		for (int i = 1; i < number; i++) 
		{
			if (number % i == 0) 
			{
				total += i;
			}
		}
		return (total == number);
	}

	//add a toString
	public String toString() 
	{
		if (isPerfect()) 
		{
			return number + " is a perfect number.";
		}
		return number + " is not a perfect number.";
	}
	
}