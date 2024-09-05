package com.desafio2.utils;

/**
 * checkAndCount class
 */
public class CheckAndCount {

    public static void checkAndCountLettersA(String word) {

        System.out.println(
                throughAndCount(word) < 0 ? "The word does not have the letter A"
                        : "the word has " + throughAndCount(word) + " lettes A");
    }

    private static int throughAndCount(String word) {
        int counter = 0;

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);

            if (character == 'a' || character == 'A') {
                counter++;
            }
        }
        return counter;
    }
}
