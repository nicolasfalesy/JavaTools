package java_tools;

import java.util.*;

public class StringArray {
    // initalize global scanner variable
    public static Scanner userInput = new Scanner(System.in);
    
    /**
     * Creates an empty String array of the specified size.
     *
     * @param size The size of the array to create.
     * @return The created empty String array.
     */
    public static String [] createEmptyStringArray(int size) {
        // initialize variables
        String [] newArray = new String[size];

        return newArray;
    } // ends createEmptyStringArray method

    /**
     * Creates a user-defined String array of the specified size.
     * Prompts the user to enter values for each element of the array.
     *
     * @param size The size of the array to create.
     * @return The created user-defined String array.
     */
    public static String [] createUserDefinedStringStudentArray(int size) {
        // initalize variables
        String [] newArray = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter student #" + (i+1) + "'s name: ");
            newArray[i] = userInput.nextLine();
        } // ends for

        return newArray;
    } // ends createUserDefinedStrngArray method

    /**
     * Creates a user-defined String array of the specified size.
     * Prompts the user to enter values for each element of the array.
     *
     * @param size The size of the array to create.
     * @return The created user-defined String array.
     */
    public static String [] createUserDefinedStringArray(int size) {
        // initalize variables
        String [] newArray = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter value #" + i+1 + ": ");
            newArray[i] = userInput.nextLine();
        } // ends for

        return newArray;
    } // ends createUserDefinedStrngArray method

    /**
     * Prints each element in the given String array.
     * @param array the String array to print
     */
    public static void print(String [] array) {
        // goes through each element and prints it
        for (int i = 0; i < array.length; i++) {
            // will only print a comma if it is not the last element
            System.out.print(array[i]);
            if (array.length - 1 > i)
                System.out.print(", ");
        } // ends for
    } // ends print method

    /**
     * Swaps the elements at the specified positions in the given String array.
     * @param array the String array
     * @param position1 the index of the first element to swap
     * @param position2 the index of the second element to swap
     */
    public static void swapElements(String [] array, int position1, int position2) {
        // creates two temp positions
        String temp1 = array[position1];
        String temp2 = array[position2];

        // switches the positions
        array[position1] = temp2;
        array[position2] = temp1;
    } // ends swapElements method
    
    /**
     * Finds and returns the index of the first occurrence of the specified value in the given String array.
     * @param value the value to search for
     * @param array the String array to search
     * @return the index of the first occurrence of the value, or -1 if the value is not found
     */
    public static int findElement(String value, String [] array) {
        // loops through each element and will return the index of where it finds it, else returns -1
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value))
                return i;
        } // ends for

        return -1;
    } // ends findElement method

    /**
     * Counts and returns the number of occurrences of the specified value in the given String array.
     * @param value the value to count
     * @param array the String array to search
     * @return the number of occurrences of the value in the array
     */
    public static int countElements(String value, String [] array) {
        // initalize variables
        int numOfElements = 0;

        // loops through each element and if it equals the given value, than it will add to the count
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value))
                numOfElements++;
        } // ends for

        return numOfElements;
    } // ends countElements method

    /**
     * Copies the contents of the given String array to a new array and returns the new array.
     * @param originalArray the String array to copy
     * @return a copy of the original array
     */
    public static String [] copyArray(String [] originalArray) {
        // initalize variables
        String [] newArray = new String[originalArray.length];

        // makes each element from original array into newArray
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = originalArray[i];
        } // ends for

        return newArray;
    } // ends copyArray method

    /**
     * Checks if the contents of two String arrays are the same.
     * @param array1 the first String array
     * @param array2 the second String array
     * @return true if the arrays have the same contents, false otherwise
     */
    public static boolean checkIfCopy(String [] array1, String [] array2) {
        // initalize variables
        boolean isCopy = false;
        int sameCount = 0;

        // checks if the arrays are identical
        if (array1 == array2) {
            return isCopy;
        } else {
            // checks if the arrays are the same length
            if (array1.length == array2.length) {
                // goes through each element and sees if all the elements in the array are the same
                for (int i = 0; i < array1.length; i++) {
                    // if an element is the same
                    if (array1[i].equals(array2[i])) {
                        sameCount++;
                        if (sameCount == array1.length)
                            isCopy = true;
                            return true;
                    } // ends if (elements are the same)
                } // ends for
            } // ends if (arrays are same length)
        } // ends else (if arrays are not identical)

        return isCopy;
    } // ends checkIfCopy method

    /**
     * Checks if two String arrays are identical (i.e., refer to the same array object).
     * @param array1 the first String array
     * @param array2 the second String array
     * @return true if the arrays are identical, false otherwise
     */
    public static boolean checkIfIdentical(String [] array1, String [] array2) {
        // ternary operator, checks a boolean and does something if true, if false does something else
        return (array1 == array2) ? true : false;
    } // ends checkIfIdentical method

    /**
     * Replaces the element at the specified position in the given String array with the specified value.
     * @param array the String array
     * @param value the new value
     * @param position the position to replace
     */
    public static void replaceElement(String [] array, String value, int position) {
        array[position] = value;
    } // ends replaceElement method

    /**
     * Replaces all occurrences of the original value with the new value in the given String array.
     * @param array the String array
     * @param originalValue the value to replace
     * @param newValue the new value
     */
    public static void replaceElements(String [] array, String originalValue, String newValue) {
        // goes through each element and sees if the element is the inputed original value, if so will replace with newValue
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(originalValue)) {
                array[i] = newValue;
            }
        } // ends for
    } // ends replaceElements method

    /**
     * Inserts a new element with the specified value at the specified position in the given String array.
     * @param originalArray the original String array
     * @param value the value to insert
     * @param position the position to insert the value
     * @return the new String array with the value inserted
     */
    public static String [] insertElement(String [] originalArray, String value, int position) {
        // initalize variables
        String [] newArray = new String[originalArray.length + 1];
        newArray[position] = value;

        // goes through each element
        for (int i = 0; i < newArray.length; i ++) {
            // if the current element index is less than the position index, it will replace the new array elmenet with the original array
            if (i < position) {
                newArray[i] = originalArray[i];
                // if current elment index is greater than position index, will replace with original array index - 1 (because the newArray length is 1 more than original array and is after the position index)
            } else if (i > position) {
                newArray[i] = originalArray[i-1];
            }
        } // ends for

        return newArray;
    } // ends insertElement method

    /**
     * Deletes the element at the specified position in the given String array.
     * @param originalArray the original String array
     * @param position the position of the element to delete
     * @return the new String array with the element deleted
     */
    public static String [] deleteElement(String [] originalArray, int position) {
        // initalize variables
        String [] newArray = new String[originalArray.length - 1];

        // goes through each element
        for (int i = 0; i < originalArray.length; i++) {
            // if the current element index is less than the position index, it will replace the new array elmenet with the original array
            if (i < position) {
                newArray[i] = originalArray[i];
                // if current elment index is greater than position index, will replace new array - 1 (because the newArray length is 1 less than original array and is after the position index) with original array index 
            } else if (i > position) {
                newArray[i-1] = originalArray[i];
            }
        } // ends for

        return newArray;
    } // ends deleteElement method
} // ends class