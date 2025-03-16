import java.util.Scanner;

public class User {
    static Scanner keyboard = new Scanner(System.in);
    
    static boolean checkAgain = true;

    public static String getString(String message) {
        System.out.print(message);
        String input = keyboard.next();
        return input;
    }

    public static int getInt(String message) {
        System.out.print(message);
        int input = keyboard.nextInt();
        return input;
    }
    public static void Player1() {
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
    }
}