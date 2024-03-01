package Tools;

public class Randoms {
    /**
     * Generates a random integer between the given minimum and maximum values (inclusive).
     *
     * @param min The minimum value of the range.
     * @param max The maximum value of the range.
     * @return A random integer between the specified range [min, max].
     */
    public static int ranNumBetween(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    } // ends ranNumBetween
} // ends class