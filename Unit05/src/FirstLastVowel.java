//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
		String vowel = "aeiouAEIOU";
	    if (vowel.contains(a.substring(0,1))||vowel.contains(a.substring(a.length()-1)))
		{
			return "yes";
		}
		else
		{
			return "no";
		}
	}
}