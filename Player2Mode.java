import java.util.Scanner;

public class Player2Mode {

	public static void Player2() {

		boolean toTheStart = true;
		boolean checkAgain = true;
		boolean checkAgain2 = true;
		boolean lastCheck = true;

		Scanner keyboard = new Scanner(System.in);

			do {
				while (checkAgain == true) {
					System.out.println();
					System.out.println(Main.player1 + " is up first");
					String choice = User.getString("Select Truth or Dare: ");

					if (choice.equalsIgnoreCase("Truth")) {
						Truth.outputTruth();
						checkAgain = false;
					} else if (choice.equalsIgnoreCase("Dare")) {
						Dare.outputDare();
						checkAgain = false;
					} else {
						System.out.println("Please enter Truth or Dare");
					}
				}
				String nextPlayer = User.getString("Press 'C' to continue to pass to the next player: ");

				if (nextPlayer.equalsIgnoreCase("C")) {
					while (checkAgain2 == true) {
						System.out.println();
						System.out.println(Main.player2 + " is up now");
						String choice2 = User.getString("Select Truth or Dare: ");

						if (choice2.equalsIgnoreCase("Truth")) {
							Truth.outputTruth();
							checkAgain2 = false;
						} else if (choice2.equalsIgnoreCase("Dare")) {
							Dare.outputDare();
							checkAgain2 = false;
						} else {
							System.out.println("Please enter Truth or Dare");
						}
					}
					String nextPlayer2 = User
							.getString("Press 'C' to pass to the next player\n" + "Press 'Exit' to end the game");
					// When entering C. Will not loop program
					while (lastCheck == true) {
						if (nextPlayer2.equalsIgnoreCase("C")) {
							toTheStart = true;
							lastCheck = false;
						} else if (nextPlayer2.equalsIgnoreCase("Exit")) {
							toTheStart = false;
							lastCheck = false;
							System.out.println("The game has ended. Thank you for playing.");
						} else {
							System.out.println("Please select one of the following");
							System.out.println();
						}
					}
				}

			} while (toTheStart == true);

			keyboard.close();
		}
	}