//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jessica Li	
//Date - 2/22/19

public class DownRunner
{
	public static void main( String args[] )
	{
		RayDown test = new RayDown();
		System.out.println(test.go(new int[] {-99,1,2,3,4,5,6,7,8,9,10,12345}));
		System.out.println(test.go(new int[] {10,9,8,7,6,5,4,3,2,1,-99}));
		System.out.println(test.go(new int[] {10,20,30,40,50,-11818,40,30,20,10}));
		System.out.println(test.go(new int[] {32767}));
		System.out.println(test.go(new int[] {255,255}));
		System.out.println(test.go(new int[] {9,10,-88,100,-555,1000}));
		System.out.println(test.go(new int[] {10,10,10,11,456}));
		System.out.println(test.go(new int[] {-111,1,2,3,9,11,20,30}));
		System.out.println(test.go(new int[] {9,8,7,6,5,4,3,2,0,-2,-989}));
		System.out.println(test.go(new int[] {12,15,18,21,23,1000}));
		System.out.println(test.go(new int[] {250,19,17,15,13,11,10,9,6,3,2,1,-455}));
		System.out.println(test.go(new int[] {9,10,-8,10000,-5000,1000}));
		
		
		
	}
}