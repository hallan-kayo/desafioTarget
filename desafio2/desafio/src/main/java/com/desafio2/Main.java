package com.desafio2;

import java.util.Scanner;

import com.desafio2.utils.CheckAndCount;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Check and count letters A.");
        System.out.println("Enter a word:");
        String word = input.next();

        CheckAndCount.checkAndCountLettersA(word);
    }
}