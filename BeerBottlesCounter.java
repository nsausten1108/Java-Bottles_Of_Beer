/* Author: Nicholas Austen
 * Date: 18 Sep 23
 * Description: BeerBottlesCounter class. Includes a For loop to decrement the bottles in the classic song "Bottles of beer", and 
 * a while loop to ensure the number of bottles doesn't drop below zero in the song. Also includes thread.sleep for 10 seconds
 * to allow for each verse of the song to be sung.
 */
public class BeerBottlesCounter {

	
	//bottlesCounter method. Utilizes a for loop to decrement beer bottles, and a while loop to ensure bottles don't decrease past
	//zero. 
	//Prints first value of number of bottles, passes one around, then prints new value of remaining bottles.
	public void bottlesCounter(){
		Main bottlesMain = new Main();
		int bottlesCount = bottlesMain.getBottles();
		int bottlesPause = bottlesMain.getPause();
		
		for (int i = bottlesCount; i>=bottlesCount;) {
			while (i>0) {
			try {
				//gives an 6 second pause between verses
				Thread.sleep(bottlesPause);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(bottlesCount + " bottles of beer on the wall, "+ bottlesCount+ " bottles of beer.");
			System.out.println("Take one down, pass it around.");
			i--;
			bottlesCount = i;
			System.out.println(bottlesCount + " bottles of beer on the wall.");
			
			}
		}
	}
	
}
