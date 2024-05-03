/* Author: Nicholas Austen
 * Date: 18 Sep 23
 * Description: BeerBottlesSong class. Includes a For loop to decrement the bottles 
 * in the classic song "Bottles of beer", and a while loop to ensure the number of bottles 
 * doesn't drop below zero in the song. Also includes thread.sleep for a number of seconds
 * that the user can decide to allow for each verse of the song to be sung.
 */
public class BeerBottlesSong {
	// Fields for number of bottles, and time between verses.
	private int bottlesCount;
	private int bottlesPause;

	// BeerBottlesSong constructor. Assigns values from user inputs in Main class.
	public BeerBottlesSong(int bottles, int pause) {
		bottlesCount = bottles;
		bottlesPause = pause;
	}// End BeerBottlesSong()

	// BottlesSong method. Recursively prints lyrics to "Bottles of beer on the
	// wall" song.
	// Pauses for a time in seconds between verses based on user inputs.
	public void bottlesSong() {
		// Prints lyrics for as many beer bottles as user selects.
		for (int i = bottlesCount; i >= bottlesCount;) {
			while (i > 0) {
				try {
					// Bives an user-selected pause (in seconds) between verses
					Thread.sleep(bottlesPause);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out
						.println(bottlesCount + " bottles of beer on the wall, " + bottlesCount + " bottles of beer.");
				System.out.println("Take one down, pass it around.");
				// Decrement bottlesCount for each verse
				i--;
				bottlesCount = i;
				System.out.println(bottlesCount + " bottles of beer on the wall.");

			}
		}
	}
}
