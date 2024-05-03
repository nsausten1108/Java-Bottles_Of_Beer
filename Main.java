/* Author: Nicholas Austen
 * Date: 18 Sep 2023
 * Description: This program prints the lyrics to the classic "Bottles Of Beer" song to the console. 
 */

import java.util.*;

public class Main {
	
	private static int bottles;
	private static int pause;
	
	//Main method. Asks user for inputs for number of bottles and pause (in seconds) between verses, then
	//instantiates BeerBottlesCounter class, and calls bottlesCounter method to print song.
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner bottlesScan = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner pauseScan = new Scanner (System.in);
		
		
		System.out.println("How many beer bottles would you like to start with?");
		bottles = bottlesScan.nextInt();
		
		//Thread.sleep is in milliseconds. Ask user how many second they want between verses, then 
		//multiply that by 1000.
		System.out.println("How long of a pause would you like, in seconds, between each verse?");
		pause = (pauseScan.nextInt())*1000;
		
		
		BeerBottlesCounter a = new BeerBottlesCounter();
		a.bottlesCounter();
	}
//Getter method for bottles input. No setter needed, because it is not needed to be set outside of class.
public int getBottles() {
	return bottles;
}
public int getPause() {
	return pause;
}
}
