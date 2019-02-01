//© A+ Computer Science
//www.apluscompsci.com

//Name - Jessica Li
//Date - 2/1/19
//Class - P 2
//Lab  - StarsAndStripes

import static java.lang.System.*;

public class StarsRunner
{
   public static void main(String args[])
   {
      //instantiate a StarsAndStripes object
      StarsAndStripes smallBox = new StarsAndStripes();
     
      //call the methods needed to make the patterns on the word document
      smallBox.printASmallBox();
      smallBox.printTwoBlankLines();
      smallBox.printABigBox();
      //importing StarsAndStripes not necessary b/c already in the same src (this is different from python word files) 
   }
}