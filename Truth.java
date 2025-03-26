/* Truth or Dare Instructions
 * 1. How many players are playing
 * 2. Enter the names/nicknames of the players
 * that are playing
 * 3. Explain the rules and start the game.
 * 4. Choose truth or dare
 * 5. Prompts random truth or dare
 * 6. Create button for exiting the game 
 */

import java.util.Random;

public class Truth {

	final static String[] truth = {
	}
	
	public Truth() {
	}

	public static void outputTruth() {
		Random randomTruth = new Random();
		int index = randomTruth.nextInt(truth.length);
		System.out.println();
		System.out.println(truth[index]);
		System.out.println();
		
	}
	}
