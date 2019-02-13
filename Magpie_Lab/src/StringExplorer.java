/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "Computer Science is the best, the greatest, and the most wonderful subject to study!";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		String lookFor = "Computer Science is the best, the greatest, and the most wonderful subject to study!";
		String word = "the";
		
		int pos = lookFor.indexOf(word);
		while (pos >=0)
		{
			System.out.println("the is found at position " + pos);
			pos = lookFor.indexOf(word, pos+word.length());
		}
		System.out.println("the is not found");
		/*for (int i = 0; i < sample.length(); i++)
		{
		   int pos = sample.indexOf("the");
		   if (pos >= 1)
		   {
			   System.out.println("the is found at position " + pos);
			   
		   }
		   sample = sample.substring(pos + 3, sample.length());
		}
		   System.out.println("the is not found");*/


	}

}
