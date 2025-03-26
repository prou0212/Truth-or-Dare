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

	public class Dare {

		final static String[] dare = {
		}

		public Dare() {
		}
		
		public static void outputDare() {
			Random randomDare = new Random();
			int index = randomDare.nextInt(dare.length);
			System.out.println();
			System.out.println(dare[index]);
			System.out.println();
		}
	}
