//� A+ Computer Science  -  www.apluscompsci.com
//Name - Jessica Li
//Date - 2/1/19
//Class - P 2
//Lab  - Slope of a Line

public class LineRunner
{
   public static void main( String[] args )
   {
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,9,14,2 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,7,18,3 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 6,4,2,2 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 4,4,5,3 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,1,2,9 ) );
		System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,7,2,9 ) );
		
	}
}