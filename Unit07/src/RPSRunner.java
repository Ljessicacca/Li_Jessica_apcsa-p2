//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		do {
		//add in a do while loop after you get the basics up and running
			System.out.print("Rock-Paper-Scissors - pick your weapon[R,P,S]::");
			RockPaperScissors test = new RockPaperScissors(keyboard.next());
			//System.out.println(test);
			System.out.println(test.determineWinner() + "\n");
			String player = "";
		
			System.out.print("Do you want to play again?");
			response = keyboard.next().charAt(0);
		
			
		}while(response == 'Y'||response == 'y');
	}
}
