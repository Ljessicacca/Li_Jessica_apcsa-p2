//(c) A+ Computer Science
//www.apluscompsci.com
//Name Jessica Li 


import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int length = str.length();
		int count = 0;
		char [] array = str.toCharArray();
		int x = 0;
		for (x = 0; x <= length-2; x++)
		{
			if (str.length() < 2)
			{ 
				return 0;
			}
			if (array[x] == array[x+1])
			{
				count++;
			}
		}
		return count;
	}
}

/* String s = ""
for (char c : s.toCharArray())
{
	out.println(c);
}

For each loop*/