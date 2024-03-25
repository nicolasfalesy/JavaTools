import java.util.*;

public class CheckValid {

    /**
     * Retrieves a valid integer input from the provided Scanner object, displaying an instruction on failure.
     *
     * @param scanner     The Scanner object used to retrieve input.
     * @param instruction The instruction message displayed when an invalid input is entered.
     * @return The valid integer input obtained from the scanner.
     */
    public static int validInteger(Scanner scanner, String instruction) {
        int validNumber = 0;

        // loops through until it finds a valid input
        while (true) {
            try {
                validNumber = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (InputMismatchException mismatch) {
                scanner.nextLine();
                System.out.print(instruction);
            }
        } // ends while
        return validNumber;
    } // ends validInteger method

    /**
     * Retrieves a valid double input from the provided Scanner object, displaying an instruction on failure.
     *
     * @param scanner     The Scanner object used to retrieve input.
     * @param instruction The instruction message displayed when an invalid input is entered.
     * @return The valid double input obtained from the scanner.
     */
    public static double validDouble(Scanner scanner, String instruction) {
        double validNumber = 0;

        // loops through until it finds a valid input
        while (true) {
            try {
                validNumber = scanner.nextDouble();
                scanner.nextLine();
                break;
            } catch (InputMismatchException mismatch) {
                scanner.nextLine();
                System.out.println(instruction);
            }
        } // ends while
        return validNumber;
    } // ends validDouble method

    /**
     * Retrieves a valid integer input between a specified range from the provided Scanner object,
     * displaying an instruction on failure.
     *
     * @param scanner     The Scanner object used to retrieve input.
     * @param instruction The instruction message displayed when an invalid input is entered.
     * @param min         The minimum value of the range (inclusive).
     * @param max         The maximum value of the range (inclusive).
     * @param textSpeed   The speed at which text is displayed.
     * @return The valid integer input obtained from the scanner.
     * @throws InterruptedException If the thread is interrupted while sleeping.
     */
    public static int getIntegerBetween(Scanner scanner, String instruction, int min, int max, int textSpeed) throws InterruptedException {
        while (true) {
            int num = validInteger(scanner, instruction);

            if (num > min-1 && num < max+1) {
                return num;
            } else {
                Printing.fancyText("\nTry again!\n" + instruction, textSpeed, 0);
            }
        } // ends while
    } // ends getIntegerBetween method

    /**
     * Retrieves a valid double input between a specified range from the provided Scanner object,
     * displaying an instruction on failure.
     *
     * @param scanner     The Scanner object used to retrieve input.
     * @param instruction The instruction message displayed when an invalid input is entered.
     * @param min         The minimum value of the range (inclusive).
     * @param max         The maximum value of the range (inclusive).
     * @param textSpeed   The speed at which text is displayed.
     * @return The valid double input obtained from the scanner.
     * @throws InterruptedException If the thread is interrupted while sleeping.
     */
    public static double getDoubleBetween(Scanner scanner, String instruction, int min, int max, int textSpeed) throws InterruptedException {
        while (true) {
            double num = validDouble(scanner, instruction);

            if (num > min-1 && num < max+1) {
                return num;
            } else {
                Printing.fancyText("\nTry again!\n" + instruction, textSpeed, 0);
            }
        } // ends while
    } // ends getIntegerBetween method

} // ends class