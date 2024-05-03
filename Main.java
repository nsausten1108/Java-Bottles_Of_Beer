/* Author: Nicholas Austen
 * Date: 18 Sep 2023
 * Description: This program prints the lyrics to the classic "Bottles Of Beer" song to the console. 
 * Calls for user inputs for number of bottles, and pause between verses.
 */

import java.util.*;

public class Main {

	// Fields for number of bottles, and pause between verses.
	private int bottles;
	private int pause;

	// Scanner objects for number of bottles, and pause between verses.
	Scanner bottlesScan = new Scanner(System.in);
	Scanner pauseScan = new Scanner(System.in);

	// Main method. Calls input methods, then calls playSong method.
	public static void main(String[] args) {
		Main main = new Main();
		main.bottlesInput();
		main.timerInput();
		main.playSong();
		System.exit(0);
	}// end main()

	public void bottlesInput() {

		// Try/catch for error checking
		try {
			System.out.println("How many beer bottles would you like to start with?");
			bottles = bottlesScan.nextInt();
		}
		// Catch block. If input isn't an integer, then notifies user, and
		// redirects to beginning of method.
		catch (Exception e) {
			System.out.println("You must enter an integer input!");
			bottlesInput();
		}
	}// end bottlesInput()

	// Timer input method. Takes in user input for time between verses.
	public void timerInput() {
		// Try/catch for error checking
		try {
			// Thread.sleep is in milliseconds in BeerBottlesSong. Ask user how many second
			// they want between verses, then multiply that by 1000.
			System.out.println("How long of a pause would you like, in seconds, between each verse?");
			pause = (pauseScan.nextInt() * 1000);
		}
		// Catch block. If input isn't an integer, then notifies user, and
		// redirects to beginning of method.
		catch (Exception e) {
			System.out.println("You must enter an integer input!");
			timerInput();
		}

	}// end timerInput();

	// Method to play song. Instantiates BeerBottlesSong class, then calls
	// bottlesSong method.
	public void playSong() {
		BeerBottlesSong sing = new BeerBottlesSong(bottles, pause);
		sing.bottlesSong();
	}// end playSong();

}// end Main class