package java_tools;

public class Printing {
    /**
     * Prints the given message with a fancy effect.
     *
     * @param message   The message to be printed.
     * @param textSpeed The speed at which each character of the message is printed (in milliseconds).
     * @param msgDelay  The delay after printing the entire message (in milliseconds).
     * @throws InterruptedException If the thread is interrupted while sleeping.
     */
    public static void fancyText(String message, int textSpeed, int msgDelay) throws InterruptedException {
        // loops through each character and prints with a delay
        for (int j = 0; j < message.length(); j++) {
            System.out.print(message.charAt(j));
            Thread.sleep(textSpeed);
        }
        // delay after it prints
        Thread.sleep(msgDelay);
    } // ends fancyText
} // ends class