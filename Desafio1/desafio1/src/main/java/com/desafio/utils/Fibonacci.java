package com.desafio.utils;

/**
 * Fibonatti class
 */
public class Fibonacci {

    /**
     * returns whether the number belongs to the sequence
     *
     * @param number int
     */
    public static void belongsToTheSequence(int number) {
        if (!fibonacciList(number)) {
            System.out.println("The number " + number + " does not belong to the sequence.");
        }
        if (fibonacciList(number)) {
            System.out.println("The number " + number + " belongs to the sequence.");
        }
    }

    /**
     * goes through the Fibonacci sequence and checks if the number belongs to it
     *
     * @param number int
     * @return boolean
     */
    private static boolean fibonacciList(int number) {

        int penultimate = 0, last = 1;
        while (last < number) {
            int temp = last;
            last = penultimate + last;
            penultimate = temp;
        }

        return number == penultimate || number == last;
    }
}