//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		letter = 'a';
		amount = 0;		
	}

	public TriangleFive(char c, int amt)
	{
		this.setLetter(c);
		this.setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output = "";
		for (int i = amount; i> 0; i--)
		{
			int x = 0;
			char letterOn = letter;
			while (x < i) 
			{
				for (int y = amount - x; y > 0; y--)
				{
					output = output + letterOn;
				}
				if (letterOn == 'z' || letterOn == 'Z')
				{
					letterOn -= 25;
				}
				else
				{
					letterOn++;
				}
				output += " ";
				x++;
			}
			output += "\n";
		}
		return output;
	}
}