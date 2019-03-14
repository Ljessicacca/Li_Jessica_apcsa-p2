//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore test = new ToyStore("blue blue blue red");
		test.sortToysByCount();
		System.out.println(test);
		System.out.println(test.getMostFrequentToy());
		
		System.out.println(new ToyStore("sorry bat sorry sorry sorry train train teddy teddy ball ball"));
		ToyStore toys = new ToyStore("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		toys.sortToysByCount();
		System.out.println(toys);
		
		ToyStore testTwo = new ToyStore("sorry sorry bat bat bat sorry");
		testTwo.sortToysByCount();
		System.out.println(testTwo);
		System.out.println(testTwo.getMostFrequentToy());
		
	}
}