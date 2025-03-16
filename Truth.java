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
			"When was your first kiss?",
			"When did you first have sex?",
			"Who in this room would you most want to kiss?",
			"What is your favourite type of porn?",
			"What is your favourite sex position?",
			"What's the weirdest thing that turns you on?",
			"Have you ever spanked someone/been spanked in bed?",
			"Who's the best kisser you've ever met?",
			"Have you ever had anal sex?",
			"Have you ever had a threesome?",
			"Have you ever fantasized about a coworker?",
			"Who in this room would you most want to sleep with?",
			"Have you ever tried role playing in bed, and what were the roles?",
			"Who's the best sexual partner you've ever had?",
			"If you could only bring one sex toy to a desert island, what would it be?",
			"What's the grossest thing that's ever happened to you during sex?",
			"If you could only do one sex act for the rest of your life, what would it be?",
			"Have you ever streaked?",
			"Who was your first sexual partner?",
			"Who in this room would you most want to see naked?",
			"Name a celebrity you've had a sexual fantasy about.",
			"Have you ever recorded yourself having sex?",
			"Describe your first kiss.",
			"Have you ever had sex in a car?",
			"Have you ever had sex in public?",
			"Which would you rather give up for a year: kissing or masturbation?",
			"Have you ever gone skinny-dipping?",
			"Tell us your most awkward sex dream.",
			"Have you ever been caught having sex?",
			"Tell us the hottest sex dream you've ever had.",
			"How often do you masturbate?",
			"Have you ever cheated on a partner?",
			"Do you own any sex toys? (And if yes, what are they?)",
			"Have you ever hooked up with a friend?",
			"What's the most embarrassing thing that's ever happened to you during sex?",
			"Have you ever had sex in the shower?",
			"Have you ever been to a sex party?",
			"How old were you when you had sex for the first time?",
			"Have you ever had sex in a pool or hot tub?",
			"Do you know what a BBC stand for (If yes, what does it stand for)?",
			"Have you ever tied someone up/been tied up in bed?",
			"Have you ever taken nudes?",
			"Which would you rather give up for a year: sex or alcohol?",
			"Do you ever watch porn?"};
	
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