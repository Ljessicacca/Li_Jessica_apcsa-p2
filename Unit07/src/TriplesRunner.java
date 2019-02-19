//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Jessica Li 

import static java.lang.System.*;
import java.util.Scanner;

public class TriplesRunner
{
   public static void main(String args[])
   {
	   Triples test = new Triples(110);
	   System.out.println(test.toString());
	   
	   test.setNum(110);
	   System.out.println(test.toString());
	   
	   test.setNum(120);
	   System.out.println(test.toString());
	   
	   test.setNum(130);
	   System.out.println(test.toString());
	   
	   test.setNum(140);
	   System.out.println(test.toString());
	   
	   test.setNum(300);
	   System.out.println(test.toString());
	}
}