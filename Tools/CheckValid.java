package Tools;

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
                System.out.println(instruction);
                scanner.nextLine();
            }
        } // ends while
        return validNumber;
    } // ends validInteger

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
                System.out.println(instruction);
                scanner.nextLine();
            }
        } // ends while
        return validNumber;
    } // ends validDouble

} // ends class