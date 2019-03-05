/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card cardOne = new Card("jack", "hearts", 17);
		System.out.println(cardOne);
		
		Card cardTwo = new Card("four", "hearts", 5);
		System.out.println(cardTwo);
		
		Card cardThree = new Card("jack", "hearts", 17);
		System.out.println(cardThree);
		
		System.out.println(cardThree.matches(cardOne));
	}
}