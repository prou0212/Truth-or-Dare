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
				"Sit on the lap of " + Main.player1 + "\n"
					+ "If it's a guy, look into their eyes and say \"Hi Daddy\".\nIf"
						+ " it's a girl, look into her eyes and say \"Hi Mommy\".",
				"Get a chair and give lap dance\n"
				+ " to the player of your choosing",
				"Do a pole dance performance (with or without a pole).",
				"Do a naked lap around the house.",
				" Send a \"u up\" text to your crush.",
				"Send an eggplant or peach emoji to your crush with "
				+ "no further explanation.",
				"Close your eyes and swipe right on your dating app ten times.",
				"Make out with the back of your hand for 15 seconds.",
				"Demonstrate your oral sex technique on the nearest "
				+ "appropriate object.",
				"Kiss " + Main.player2 + " on the cheek.",
				"Do a body shot off " + Main.player3 + ".",
				"Dance seductively to \"Pony\" by Ginuwine.\nDo it for a least 1 minute.",
				"Dance seductively to \"I'm Too Sexy\" by Right Said Fred.\nDo it for "
				+ "a least 1 minute.",
				"Take off your shirt and keep it off for the next round.",
				"Do your best impression of a Fifty Shades of Grey sex scene.",
				"Kiss " + Main.player4 + " with tongue for minimum 5 seconds.",
				"Give " + Main.player1 + " a one-minute head massage.",
				"Dance seductively to \"Vagina\" by CupcakKe.",
				"Choose a partner and do a reenactment of a seventh-grade slow dance.",
				"Pull up the most recent email you sent, and read it as though "
				+ "it were the sexiest sext of all time.",
				"Do a striptease for the group.",
				"Give " + Main.player2 + " a one-minute foot massage.",
				"Do a reenactment of your most embarrassing sexual encounter.",
				"Pass someone a sip of your drink from your mouth.",
				"Choose a partner and do a reenactment of a seventh-grade slow dance.",
				"Do Seven Minutes in Heaven with " + Main.player3 + ".",
				"Do a dramatic reading of a sex scene from a romance novel.",
				"Swap shirts with someone in the room.",
				"Do a reenactment of the first time you had sex.",
				"Do a dramatic reading of the most recent sext you sent.",
				"Let someone in the group take charge of your dating profile for five minutes.",
				"Give " + Main.player4 + " a one-minute back massage.",
				"Do your best impression of a porno that involves a pizza "
				+ "delivery guy. Have " + Main.player1 + " be the pizza delivery person.",
				"Pass someone a sip of your drink from your mouth.",
				"Turn on a sexy song of your choice and grind up against the wall for 30 seconds.",
				"Demonstrate your hand job technique on the nearest appropriate "
				+ "object.",
				"Show the group a sexy selfie saved to your phone.",
				"Dance seductively to \"Deep Throat\" by CupcakKe.",
				"Kiss " + Main.player2 + " on the lips.",
				"Grab a marker and let someone in the group draw a tattoo of their choice on your butt.",
				"Let someone in the group take charge of your dating profile for five minutes.",
				"Spin an empty bottle and kiss whoever it lands on "
				+ "(as long as they consent)."};

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
