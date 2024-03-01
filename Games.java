package Tools;

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
        Printing.fancyText("\nWould you like to play again? (yes/no): ", 22, 100);

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
                Printing.fancyText("\nI don't understand, try again (yes/no): ", 22, 100);
        } // ends while

        return playAgain;
    } // ends playAgain method;

    /**
     * Prompts the user to input the number of rounds they want to play and returns
     * the chosen number.
     *
     * @param textSpeed    The speed of text display.
     * @param messageDelay The delay between messages.
     * @param userInput    Scanner object to read user input.
     * @return The number of rounds chosen by the user.
     * @throws InterruptedException If interrupted while waiting for user input.
     */
    public static int numberRounds(int textSpeed, int messageDelay, Scanner userInput) throws InterruptedException {
        // initializes variables
        String instruction = "\nInvalid answer, how many rounds would you like to play: ";
        int numberRounds = -1;

        // asks how many rounds they would like to play and stores it
        Printing.fancyText("\nHow many round would you like to play?: ", textSpeed, messageDelay);

        // will loop until it gets a valid answer (greater than 0 and an integer)
        while (true) {
            numberRounds = CheckValid.validInteger(userInput, instruction);

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
            input = CheckValid.validInteger(userInput, "Please input an integer: "); // makes the user enters am integer

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
} // ends class
