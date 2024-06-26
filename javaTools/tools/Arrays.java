package tools;

import java.util.*;

public class Arrays {
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

    /**
     * Creates an empty integer array of the specified size.
     * @param size the size of the array to create
     * @return the newly created empty integer array
     */
    public static int [] createEmptyIntArray(int size) {
        int newArray[] = new int [size];

        return newArray;
    } // ends createEmptyIntArray method

    /**
     * Creates a random integer array of the specified size, with values between min and max.
     * @param size the size of the array to create
     * @param min the minimum value for the random numbers
     * @param max the maximum value for the random numbers
     * @return the newly created random integer array
     */
    public static int [] createRandomIntArray(int size, int min, int max) {
        // initalize variables
        Random rand = new Random();
        int newArray[] = createEmptyIntArray(size);

        // goes through each element and makes it a randon number
        for (int i = 0; i < size; i++) {
            newArray[i] = rand.nextInt(max - min + 1) + min; 
        } // ends for
        
        return newArray;
    } // ends createRandomIntArray method

    /**
     * Creates an integer array of the specified size, with values entered by the user.
     * @param size      The size of the array to create.
     * @param textSpeed The speed at which text is displayed.
     * @return the newly created integer array with user-defined values
     * @throws InterruptedException If the thread is interrupted while sleeping.
     */
    public static int [] createUserDefinedIntArray(int size, int textSpeed) throws InterruptedException {
        // initalizes variables
        int [] newArray = createEmptyIntArray(size);

        // asks user for the value for each element in the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value #" + (i+1) + ": ");
            newArray[i] = CheckValid.validInteger(userInput, "Enter value #" + (i+1) + ": ", textSpeed);
        } // ends for

        return newArray;
    } // ends createUserDefinedIntArray method

    /**
     * Prints each element in the given integer array.
     * @param array the integer array to print
     */
    public static void print(int [] array) {
        // goes through each element and prints it
        for (int i = 0; i < array.length; i++) {
            // will only print a comma if it is not the last element
            System.out.print(array[i]);
            if (array.length - 1 > i)
                System.out.print(", ");
        } // ends for
    } // ends print method

    /**
     * Finds and returns the maximum value position in the given integer array.
     * @param array the integer array to search
     * @return the maximum value position in the array
     */
    public static int findMax(int [] array) {
        // initalize variables
        int position = 0;

        // goes through each element and if the current position is greater than what is already max, will replace
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[position])
                position = i;
        } // ends for

        return position;
    } // ends findMax method

    /**
     * Finds and returns the minimum value position in the given integer array.
     * @param array the integer array to search
     * @return the minimum value position in the array
     */
    public static int findMin(int [] array) {
        // initalize variables
        int position = 0;
        // goes through each element and if the current position is less than what is already min, will replace
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[position])
                position = i;
        } // ends for

        return position;
    } // ends findMin method

    /**
     * Swaps the elements at the specified positions in the given integer array.
     * @param array the integer array
     * @param position1 the index of the first element to swap
     * @param position2 the index of the second element to swap
     */
    public static void swapElements(int [] array, int position1, int position2) {
        // creates two temp positions
        int temp1 = array[position1];
        int temp2 = array[position2];

        // switches the positions
        array[position1] = temp2;
        array[position2] = temp1;
    } // ends swapElements method

    /**
     * Finds and returns the index of the first occurrence of the specified value in the given integer array.
     * @param value the value to search for
     * @param array the integer array to search
     * @return the index of the first occurrence of the value, or -1 if the value is not found
     */
    public static int findElement(int value, int [] array) {
        // loops through each element and will return the index of where it finds it, else returns -1
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return i;
        } // ends for

        return -1;
    } // ends findElement method

    /**
     * Counts and returns the number of occurrences of the specified value in the given integer array.
     * @param value the value to count
     * @param array the integer array to search
     * @return the number of occurrences of the value in the array
     */
    public static int countElements(int value, int [] array) {
        // initalize variables
        int numOfElements = 0;

        // loops through each element and if it equals the given value, than it will add to the count
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                numOfElements++;
        } // ends for

        return numOfElements;
    } // ends countElements method

    /**
     * Copies the contents of the given integer array to a new array and returns the new array.
     * @param originalArray the integer array to copy
     * @return a copy of the original array
     */
    public static int [] copyArray(int [] originalArray) {
        // initalize variables
        int [] newArray = new int[originalArray.length];

        // makes each element from original array into newArray
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = originalArray[i];
        } // ends for

        return newArray;
    } // ends copyArray method

    /**
     * Checks if the contents of two integer arrays are the same.
     * @param array1 the first integer array
     * @param array2 the second integer array
     * @return true if the arrays have the same contents, false otherwise
     */
    public static boolean checkIfCopy(int [] array1, int [] array2) {
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
                    if (array1[i] == array2[i]) {
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
     * Checks if two integer arrays are identical (i.e., refer to the same array object).
     * @param array1 the first integer array
     * @param array2 the second integer array
     * @return true if the arrays are identical, false otherwise
     */
    public static boolean checkIfIdentical(int [] array1, int [] array2) {
        // ternary operator, checks a boolean and does something if true, if false does something else
        return (array1 == array2) ? true : false;
    } // ends checkIfIdentical method

    /**
     * Replaces the element at the specified position in the given integer array with the specified value.
     * @param array the integer array
     * @param value the new value
     * @param position the position to replace
     */
    public static void replaceElement(int [] array, int value, int position) {
        array[position] = value;
    } // ends replaceElement method

    /**
     * Replaces all occurrences of the original value with the new value in the given integer array.
     * @param array the integer array
     * @param originalValue the value to replace
     * @param newValue the new value
     */
    public static void replaceElements(int [] array, int originalValue, int newValue) {
        // goes through each element and sees if the element is the inputed original value, if so will replace with newValue
        for (int i = 0; i < array.length; i++) {
            if (array[i] == originalValue) {
                array[i] = newValue;
            }
        } // ends for
    } // ends replaceElements method

    /**
     * Inserts a new element with the specified value at the specified position in the given integer array.
     * @param originalArray the original integer array
     * @param value the value to insert
     * @param position the position to insert the value
     * @return the new integer array with the value inserted
     */
    public static int [] insertElement(int [] originalArray, int value, int position) {
        // initalize variables
        int [] newArray = new int[originalArray.length + 1];
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
     * Deletes the element at the specified position in the given integer array.
     * @param originalArray the original integer array
     * @param position the position of the element to delete
     * @return the new integer array with the element deleted
     */
    public static int [] deleteElement(int  [] originalArray, int position) {
        // initalize variables
        int [] newArray = new int[originalArray.length - 1];

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

    /**
     * Sorts the elements of the given integer array in descending order (high to low).
     * @param originalArray the original integer array
     * @return the new integer array with elements sorted in descending order
     */
    public static int [] sortHighToLow(int [] originalArray) {
        // initalize variables
        int [] newArray = new int[originalArray.length];
        int maxPos = -1;
        int size = originalArray.length;

        // goes through each element
        for (int i = 0; i < size; i++) {
            // finds max number and position in original array
            maxPos = findMax(originalArray);

            // sets the max position to current element and deletes it from the original array
            newArray[i] = originalArray[maxPos];
            originalArray = deleteElement(originalArray, maxPos);
        } // ends for

        return newArray;
    } // ends sortHighToLow method

    /**
     * Sorts the elements of the given integer array in ascending order (low to high).
     * @param originalArray the original integer array
     * @return the new integer array with elements sorted in ascending order
     */
    public static int [] sortLowToHigh(int [] originalArray) {
        // initalize variables
        int [] newArray = new int[originalArray.length];
        int minPos = -1;
        int size = originalArray.length;

        // loops through each element
        for (int i = 0; i < size; i++) {
            // finds min number and position in original array
            minPos = findMin(originalArray);

            // sets the min position to current element and deletes it from the original array
            newArray[i] = originalArray[minPos];
            originalArray = deleteElement(originalArray, minPos);
        } // ends for

        return newArray;
    } // ends sortLowToHigh method

    /**
     * Creates an empty double array of the specified size.
     * @param size the size of the array to create
     * @return the newly created empty double array
     */
    public static double [] createEmptyDoubleArray(int size) {
        double newArray[] = new double [size];

        return newArray;
    } // ends createEmptyDoubleArray method

    /**
     * Creates an double array of the specified size, with values entered by the user.
     * @param size the size of the array to create
     * @return the newly created double array with user-defined values
     */
    public static double [] createUserDefinedDoubleArray(int size) {
        // initalizes variables
        double [] newArray = createEmptyDoubleArray(size);

        // asks user for the value for each element in the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value #" + i+1 + ": ");
            newArray[i] = CheckValid.validDouble(userInput, "Enter value #" + i+1 + ": ");
        } // ends for

        return newArray;
    } // ends createUserDefinedDoubleArray method

    /**
     * Creates a double array with user-defined values for each element.
     *
     * @param size         The size of the array to create.
     * @param studentNames An array of student names corresponding to each element in the array.
     * @param textSpeed    The speed of text output (in milliseconds).
     * @return A double array containing user-defined values.
     * @throws InterruptedException If the thread is interrupted while waiting for user input.
     */
    public static double [] createUserDefinedDoubleStudentArray(int size, String [] studentNames, int textSpeed) throws InterruptedException {
        // initalizes variables
        double [] newArray = Arrays.createEmptyDoubleArray(size);

        // asks user for the value for each element in the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + studentNames[i] + "'s grade (in %): ");
            newArray[i] = CheckValid.getDoubleBetween(userInput, "Enter " + studentNames[i] + "'s grade (in %): ", 0.0, 100.0, textSpeed);
        } // ends for

        return newArray;
    } // ends createUserDefinedDoubleArray method

    /**
     * Prints each element in the given double array.
     * @param array the double array to print
     */
    public static void print(double [] array) {
        // goes through each element and prints it
        for (int i = 0; i < array.length; i++) {
            // will only print a comma if it is not the last element
            System.out.print(array[i]);
            if (array.length - 1 > i)
                System.out.print(", ");
        } // ends for
    } // ends print method

    /**
     * Finds and returns the maximum value position in the given double array.
     * @param array the double array to search
     * @return the maximum value position in the array
     */
    public static int findMax(double [] array) {
        // initalize variables
        int position = 0;

        // goes through each element and if the current position is greater than what is already max, will replace
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[position])
                position = i;
        } // ends for

        return position;
    } // ends findMax method

    /**
     * Finds and returns the minimum value position in the given double array.
     * @param array the double array to search
     * @return the minimum value position in the array
     */
    public static int findMin(double [] array) {
        // initalize variables
        int position = 0;
        // goes through each element and if the current position is less than what is already min, will replace
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[position])
                position = i;
        } // ends for

        return position;
    } // ends findMin method

    /**
     * Swaps the elements at the specified positions in the given double array.
     * @param array the double array
     * @param position1 the index of the first element to swap
     * @param position2 the index of the second element to swap
     */
    public static void swapElements(double [] array, int position1, int position2) {
        // creates two temp positions
        double temp1 = array[position1];
        double temp2 = array[position2];

        // switches the positions
        array[position1] = temp2;
        array[position2] = temp1;
    } // ends swapElements method

    /**
     * Finds and returns the index of the first occurrence of the specified value in the given double array.
     * @param value the value to search for
     * @param array the double array to search
     * @return the index of the first occurrence of the value, or -1 if the value is not found
     */
    public static int findElement(double value, double [] array) {
        // loops through each element and will return the index of where it finds it, else returns -1
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return i;
        } // ends for

        return -1;
    } // ends findElement method

    /**
     * Counts and returns the number of occurrences of the specified value in the given double array.
     * @param value the value to count
     * @param array the double array to search
     * @return the number of occurrences of the value in the array
     */
    public static int countElements(double value, double [] array) {
        // initalize variables
        int numOfElements = 0;

        // loops through each element and if it equals the given value, than it will add to the count
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                numOfElements++;
        } // ends for

        return numOfElements;
    } // ends countElements method

    /**
     * Copies the contents of the given double array to a new array and returns the new array.
     * @param originalArray the double array to copy
     * @return a copy of the original array
     */
    public static double [] copyArray(double [] originalArray) {
        // initalize variables
        double [] newArray = new double[originalArray.length];

        // makes each element from original array into newArray
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = originalArray[i];
        } // ends for

        return newArray;
    } // ends copyArray method

    /**
     * Checks if the contents of two double arrays are the same.
     * @param array1 the first double array
     * @param array2 the second double array
     * @return true if the arrays have the same contents, false otherwise
     */
    public static boolean checkIfCopy(double [] array1, double [] array2) {
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
                    if (array1[i] == array2[i]) {
                        sameCount++;
                        if (sameCount == array1.length)
                            return true;
                    } // ends if (elements are the same)
                } // ends for
            } // ends if (arrays are same length)
        } // ends else (if arrays are not identical)

        return isCopy;
    } // ends checkIfCopy method

    /**
     * Checks if two double arrays are identical (i.e., refer to the same array object).
     * @param array1 the first double array
     * @param array2 the second double array
     * @return true if the arrays are identical, false otherwise
     */
    public static boolean checkIfIdentical(double [] array1, double [] array2) {
        // ternary operator, checks a boolean and does something if true, if false does something else
        return (array1 == array2) ? true : false;
    } // ends checkIfIdentical method

    /**
     * Replaces the element at the specified position in the given double array with the specified value.
     * @param array the double array
     * @param value the new value
     * @param position the position to replace
     */
    public static void replaceElement(double [] array, double value, int position) {
        array[position] = value;
    } // ends replaceElement method

    /**
     * Replaces all occurrences of the original value with the new value in the given double array.
     * @param array the double array
     * @param originalValue the value to replace
     * @param newValue the new value
     */
    public static void replaceElements(double [] array, int originalValue, int newValue) {
        // goes through each element and sees if the element is the inputed original value, if so will replace with newValue
        for (int i = 0; i < array.length; i++) {
            if (array[i] == originalValue) {
                array[i] = newValue;
            }
        } // ends for
    } // ends replaceElements method

    /**
     * Inserts a new element with the specified value at the specified position in the given double array.
     * @param originalArray the original double array
     * @param value the value to insert
     * @param position the position to insert the value
     * @return the new double array with the value inserted
     */
    public static double [] insertElement(double [] originalArray, double value, int position) {
        // initalize variables
        double [] newArray = new double[originalArray.length + 1];
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
     * Deletes the element at the specified position in the given double array.
     * @param originalArray the original double array
     * @param position the position of the element to delete
     * @return the new double array with the element deleted
     */
    public static double [] deleteElement(double [] originalArray, int position) {
        // initalize variables
        double [] newArray = new double[originalArray.length - 1];

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

    /**
     * Sorts the elements of the given double array in descending order (high to low).
     * @param originalArray the original double array
     * @return the new double array with elements sorted in descending order
     */
    public static double [] sortHighToLow(double [] originalArray) {
        // initalize variables
        double [] newArray = new double[originalArray.length];
        int maxPos = -1;
        int size = originalArray.length;

        // goes through each element
        for (int i = 0; i < size; i++) {
            // finds max number and position in original array
            maxPos = findMax(originalArray);

            // sets the max position to current element and deletes it from the original array
            newArray[i] = originalArray[maxPos];
            originalArray = deleteElement(originalArray, maxPos);
        } // ends for

        return newArray;
    } // ends sortHighToLow method

    /**
     * Sorts the elements of the given double array in ascending order (low to high).
     * @param originalArray the original double array
     * @return the new double array with elements sorted in ascending order
     */
    public static double [] sortLowToHigh(double [] originalArray) {
        // initalize variables
        double [] newArray = new double[originalArray.length];
        int minPos = -1;
        int size = originalArray.length;

        // loops through each element
        for (int i = 0; i < size; i++) {
            // finds min number and position in original array
            minPos = findMin(originalArray);

            // sets the min position to current element and deletes it from the original array
            newArray[i] = originalArray[minPos];
            originalArray = deleteElement(originalArray, minPos);
        } // ends for

        return newArray;
    } // ends sortLowToHigh method

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