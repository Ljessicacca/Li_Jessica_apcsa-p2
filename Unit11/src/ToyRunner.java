//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy test = new Toy(); 
		test.setName("sorry");
		test.setCount(1);
		System.out.println(test.toString());
		
		test.setName("Gi Joe");
		test.setCount(5);
		System.out.println(test.toString());
	}
}