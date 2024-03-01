package Tools;

public class MDArrays {
    
	/**
	 * Creates a duplicate of a MD String array.
	 *
	 * @param array The original MD String array to be duplicated.
	 * @return A new MD String array containing the same elements as the original.
	 */
	public static String[][] duplicateMdArray(String[][] array) {
		String[][] newArray = new String[array.length][array.length];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				newArray[i][j] = array[i][j]; // makes each element in the new array the same as the previous array
			} // ends for (columns)
		} // ends for (rows)

		return newArray;
	} // ends duplicateMDArray method
} // ends class
