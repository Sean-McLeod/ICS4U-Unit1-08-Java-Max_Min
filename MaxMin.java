/*
* This program generates random numbers
* and figures out the max and the min.
*
* @author  Sean McLeod
* @version 1.0
* @since   2021-05-01
*/

import java.util.Random;


final class MaxMin {
    /** Size of array. */
    static final int SIZE_OF_ARRAY = 10;

    private MaxMin() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    public static int maxCalculator(final int[] randomSet) {
        // This function calculates max
        int max = randomSet[0];

        for (int counter = 0; counter < SIZE_OF_ARRAY; counter++) {
            if (randomSet[counter] > max) {
                max = randomSet[counter];
            }
        }
        // return parameter
        return (max);
    }

    public static int minCalculator(final int[] randomSet) {
        // This function calculates min
        int min = randomSet[0];

        for (int counter = 0; counter < SIZE_OF_ARRAY; counter++) {
            if (randomSet[counter] < min) {
                min = randomSet[counter];
            }
        }
        // return parameter
        return (min);
    }

    public static void main(final String[] args) {
        final int high = 99;
        final int low = 1;
        int[] randomSet;
        // 10 items in this array
        randomSet = new int[SIZE_OF_ARRAY];


        for (int counter = 0; counter < SIZE_OF_ARRAY; counter++) {
            // generate randon number
            Random rand = new Random();
            int randomNumber = rand.nextInt(high - low + 1) + low;
            // initialize the elements
            randomSet[counter] = randomNumber;

            System.out.println(randomNumber);
        }

        // pass & accept parameters
        int max = maxCalculator(randomSet);
        int min = minCalculator(randomSet);
        // output
        System.out.println("\nmax number is: " + max);
        System.out.println("\nmin number is: " + min);
    }
}
