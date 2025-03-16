import java.util.Scanner;

/* Truth or Dare Instructions
 * 1. How many players are playing
 * 2. Enter the names/nicknames of the players
 * that are playing
 * 3. Explain the rules and start the game.
 * 4. Choose truth or dare
 * 5. Prompts random truth or dare
 * 6. Create button for exiting the game 
 */

public class Main {

	public static int enterPlayers = 0;
	public static String player1 = null;
	public static String player2 = null;
	public static String player3 = null;
	public static String player4 = null;

	public static void main(String[] args) {

		boolean continueCheck = true;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to 'Extreme Truth or Drink' (Players 2-4)"
				+ "\nPlease select how many players will be playing: ");

//		int numbers = enterPlayers.hasNextInt();

		// TO DO: Loop this portion. If the player enters a number
		// that is not between 2 and 4. It loops back to tell the user
		// to enter in the correct credentials

/////////////////////////////////////////////////////////////////////////////////////////////////////
//MAIN MENU SETTINGS

		do {
			enterPlayers = keyboard.nextInt();
			switch (enterPlayers) {
			case 2:
				System.out.println();
				System.out.println("2 player mode enabled");
				player1 = User.getString("Player 1: Enter your name/nickname: ");
				player2 = User.getString("Player 2: Enter your name/nickname: ");
				continueCheck = false;
				break;
			case 3:
				System.out.println();
				System.out.println("3 player mode enabled");
				player1 = User.getString("Player 1: Enter your name/nickname: ");
				player2 = User.getString("Player 2: Enter your name/nickname: ");
				player3 = User.getString("Player 3: Enter your name/nickname: ");
				continueCheck = false;
				break;
			case 4:
				System.out.println();
				System.out.println("4 player mode enabled");
				player1 = User.getString("Player 1: Enter your name/nickname: ");
				player2 = User.getString("Player 2: Enter your name/nickname: ");
				player3 = User.getString("Player 3: Enter your name/nickname: ");
				player4 = User.getString("Player 4: Enter your name/nickname: ");
				continueCheck = false;
				break;
			default:
				System.out.println("Please enter a number between 2 and 4");
			}
		} while (continueCheck == true);

		System.out.println("Here are the rules for 'Extreme Truth or Drink'.");
		System.out.println("Player 1 will be up first and will be asked to pick from truth or dare."
				+ "\nThe player will do the truth/dare they had been given to the best "
				+ "of their ability.\nThe turn will be passed to the next player.");
		System.out.println("Best of luck to you");

//////////////////////////////////////////////////////////////////////////////////////////////////////
//PLAYER 2 SETTINGS
		Player2Mode.Player2();

////////////////////////////////////////////////////////////////////////////////////////////////////
//PLAYER 3 SETTINGS
		Player3Mode.Player3();

/////////////////////////////////////////////////////////////////////////////////////////////////////
//PLAYER 4 SETTINGS
		Player4Mode.Player4();

		keyboard.close();
	}
}