import java.util.Scanner;

public class Player4Mode {

	public static void Player4() {

		boolean toTheStart = true;
		boolean checkAgain = true;
		boolean checkAgain2 = true;
		boolean checkAgain3 = true;
		boolean checkAgain4 = true;
		boolean lastCheck = true;

		Scanner keyboard = new Scanner(System.in);

		do {
			
			while (checkAgain == true) {
				// PLAYER 1
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
					// PLAYER 2
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
				String nextPlayer2 = User.getString("Press 'C' to continue to pass to the next player: ");

				// PLAYER 3
				if (nextPlayer2.equalsIgnoreCase("C"))
					while (checkAgain3 == true) {
						System.out.println();
						System.out.println(Main.player3 + " is up now");
						String choice3 = User.getString("Select Truth or Dare: ");

						if (choice3.equalsIgnoreCase("Truth")) {
							Truth.outputTruth();
							checkAgain3 = false;
						} else if (choice3.equalsIgnoreCase("Dare")) {
							Dare.outputDare();
							checkAgain3 = false;
						} else {
							System.out.println("Please enter Truth or Dare");
						}
					}
				String nextPlayer3 = User.getString("Press 'C' to continue to pass to the next player: ");
				//PLAYER 4
				if (nextPlayer3.equalsIgnoreCase("C"))
					while (checkAgain4 == true) {
						System.out.println();
						System.out.println(Main.player4 + " is up now");
						String choice4 = User.getString("Select Truth or Dare: ");

						if (choice4.equalsIgnoreCase("Truth")) {
							Truth.outputTruth();
							checkAgain3 = false;
						} else if (choice4.equalsIgnoreCase("Dare")) {
							Dare.outputDare();
							checkAgain4 = false;
						} else {
							System.out.println("Please enter Truth or Dare");
						}
					}
				String nextPlayer4 = User
						.getString("Press 'C' to pass to the next player\n" + "Press 'Exit' to end the game");
				while (lastCheck) {
					if (nextPlayer4.equalsIgnoreCase("C")) {
						toTheStart = true;
						lastCheck = false;
					} else if (nextPlayer4.equalsIgnoreCase("Exit")) {
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