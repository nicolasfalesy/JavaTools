package tools;

import java.util.Scanner;

public class Games {
    /**
     * Asks the user if they want to play the game again and retrieves their
     * response.
     *
     * @param userInput A Scanner object to collect user input.
     * @return A boolean indicating whether the user wants to play again (true for
     *         yes, false for no).
     * @throws InterruptedException If the thread is interrupted while waiting for
     *                              user input.
     */
    public static boolean playAgain(Scanner userInput) throws InterruptedException {
        // asks the user if they want to play again
        Printing.fancyText("\nWould you like to play again? (yes/no): ", 22, 0);

        boolean playAgain;

        // loops until a valid answer is given (yes or no)
        while (true) {
            String input = userInput.nextLine();
            // checks if they want to play again or not
            // for yes
            if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("yeah")
                    || input.equalsIgnoreCase("yep")) {
                playAgain = true;
                break;
                // for no
            } else if (input.equalsIgnoreCase("n") || input.equalsIgnoreCase("no") || input.equalsIgnoreCase("nope")
                    || input.equalsIgnoreCase("nah")) {
                playAgain = false;
                Printing.fancyText("Okay, have a good one!", 22, 50);
                break;
                // anything else
            } else
                Printing.fancyText("\nI don't understand, try again (yes/no): ", 22, 0);
        } // ends while

        return playAgain;
    } // ends playAgain method;

    /**
     * Prompts the user to input the number of rounds they want to play and returns
     * the chosen number.
     *
     * @param textSpeed    The speed of text display.
     * @param userInput    Scanner object to read user input.
     * @return The number of rounds chosen by the user.
     * @throws InterruptedException If interrupted while waiting for user input.
     */
    public static int numberRounds(int textSpeed, Scanner userInput) throws InterruptedException {
        // initializes variables
        String instruction = "\nInvalid answer, how many rounds would you like to play?: ";
        int numberRounds = -1;

        // asks how many rounds they would like to play and stores it
        Printing.fancyText("\nHow many rounds would you like to play?: ", textSpeed, 0);

        // will loop until it gets a valid answer (greater than 0 and an integer)
        while (true) {
            numberRounds = CheckValid.validInteger(userInput, instruction, textSpeed);

            if (numberRounds < 1)
                System.out.println(instruction);
            else
                break;
        } // ends while

        return numberRounds;
    } // ends numOfRounds method

    /**
     * Collects and validates a letter input (A-J) from the user.
     *
     * @param textSpeed  The speed of text display.
     * @param msgDelay   The delay between messages.
     * @param userInput  Scanner object for user input.
     * @return A validated letter input (A-J) from the user.
     * @throws InterruptedException If interrupted while displaying text.
     */
    public static String collectLetter(int textSpeed, int msgDelay, Scanner userInput, int userGuessCount) throws InterruptedException {
        // asks what row the user wants to guess and collects the input
        if (userGuessCount == 1) {
            Printing.fancyText("\nWhat row (A-J) would you like to guess?: ", textSpeed, msgDelay);
        } else {
            System.out.print("\nWhat row (A-J) would you like to guess?: ");
        }
        String input;

        while (true) {
            input = userInput.nextLine();

            // checks if it is one of the letters on the board
            if (input.equalsIgnoreCase("a") || input.equalsIgnoreCase("b") || input.equalsIgnoreCase("c") || input.equalsIgnoreCase("d") || input.equalsIgnoreCase("e") || input.equalsIgnoreCase("f") || input.equalsIgnoreCase("g") || input.equalsIgnoreCase("h") || input.equalsIgnoreCase("i") || input.equalsIgnoreCase("j")) {
                break;
                // if they don't enter a letter between a-j
            } else {
                Printing.fancyText("\nPlease input a letter between A-J: ", textSpeed, msgDelay);
            }
        } // ends while
        return input;
    } // ends collectLetter method

    /**
     * Collects and validates a number input (0-9) from the user.
     *
     * @param textSpeed  The speed of text display.
     * @param msgDelay   The delay between messages.
     * @param userInput  Scanner object for user input.
     * @return A validated number input (0-9) from the user.
     * @throws InterruptedException If interrupted while displaying text.
     */
    public static int collectNumber(int textSpeed, int msgDelay, Scanner userInput, int userGuessCount) throws InterruptedException {
        // asks what column the user wants to guess and collects the input
        if (userGuessCount == 1) {
            Printing.fancyText("\nWhat column (0-9) would you like to guess?: ", textSpeed, msgDelay);
        } else {
            System.out.print("\nWhat column (0-9) would you like to guess?: ");
        }
        
        int input;

        while (true) {
            input = CheckValid.validInteger(userInput, "Please input an integer: ", textSpeed); // makes the user enters am integer

            // checks if it is one of the numbers on the board
            if (input == 0 || input == 1 || input == 2 || input == 3 || input == 4 || input == 5 || input == 6 || input == 7 || input == 8 || input == 9) {
                break;
                // if they don't enter a number bween 0-9
            } else {
                Printing.fancyText("\nPlease enter an integer between 0-9: ", textSpeed, msgDelay);
            }
        }

        return input;
    } // ends collectNumber method

    /**
     * Prompts the user to input the number of players and returns the value.
     *
     * @param userInput The Scanner object used to get input from the user.
     * @param textSpeed The speed at which text is printed to the console.
     * @param msgDelay  The delay between messages printed to the console.
     * @return The number of players entered by the user.
     * @throws InterruptedException If the thread is interrupted while waiting.
     */
    public static int numberPlayers(Scanner userInput, int textSpeed, int msgDelay) throws InterruptedException {
        // initializes variables
        String instruction = "\nInvalid answer, how many people are playing?: ";
        int numberPlayers = -1;

        // asks how many players are playing and stores it
        Printing.fancyText("\nHow many rounds would you like to play?: ", textSpeed, msgDelay);
        // gets a valid answer (in between 1 and 10)
        numberPlayers = CheckValid.getIntegerBetween(userInput, instruction, 1, 10, textSpeed);

        return numberPlayers;
    } // ends numberPlays method

    public static void introduction(int textSpeed, int msgDelay, String[] introductions) throws InterruptedException {
        for (String introduction : introductions) {
            Printing.fancyText("\n" + introduction, textSpeed, msgDelay);
        } // ends for
    } // ends introduction method

    /**
	 * Displays the option to read the rules of battleship based on user input with specified text speed, message delay, and Scanner for user input.
	 *
	 * @param textSpeed The speed at which the text is displayed.
	 * @param msgDelay  The delay between messages.
	 * @param userInput Scanner object to receive user input.
     * @param game String of name of game.
     * @param rules String array containing rules of the game.
	 * @throws InterruptedException If the thread is interrupted while sleeping.
	 */
	public static void rules(int textSpeed, int msgDelay, Scanner userInput, String game, String[] rules) throws InterruptedException {
		Printing.fancyText("\nWould you like to read the rules of " + game + "? (yes/no): ", textSpeed, 0);
		String input;

		// loops through until it gets a yes/no
		while (true) {
			// gets the user's input
			input = userInput.nextLine();

			// checks if it's a yes, no, or something else
			// for yes
			if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("yeah") || input.equalsIgnoreCase("yep") || input.equalsIgnoreCase("sure") || input.equalsIgnoreCase("ye")) {
				// prints all the rules
                Printing.fancyText("\n<---------------------Rules--------------------->", textSpeed, msgDelay);
                System.out.println();
                for (String rule : rules) {
                    System.out.println("\n - " + rule);
                }
				
				// doesn't start the game until the user is done reading the rules (Or at least until they tell the program they are done)
				Printing.fancyText("\nEnter 'q' when you are finished reading the rules: ", textSpeed, 0);
				while (true) {
					// looks for the user to type a 'q' so it knows when to continue with the game
					input = userInput.nextLine();
					if (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("quit")) {
						break;
					} else {
                        Printing.fancyText("\nPlease enter 'q': ", textSpeed, 0);
					}
				} // ends while
				break;
				// for no
			} else if (input.equalsIgnoreCase("n") || input.equalsIgnoreCase("no") || input.equalsIgnoreCase("nah") || input.equalsIgnoreCase("nope")) {
				Printing.fancyText("\nOkay, sounds good!", textSpeed, msgDelay);
				break;
				// for anything else
			} else {
				Printing.fancyText("\nI don't understand, please try again (yes/no): ", textSpeed, 0);
			}
		} // ends while

	} // ends rules method
} // ends class