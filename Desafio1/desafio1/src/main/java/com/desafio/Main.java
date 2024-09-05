package com.desafio;

import java.util.Scanner;

import com.desafio.utils.Fibonacci;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Fibonacci sequence");
        System.out.println("Enter a number.");
        int number = input.nextInt();

        // Como o método belongsToTheSequence é estático, pode ser chamado diretamente
        // pela classe
        Fibonacci.belongsToTheSequence(number);

        input.close();
    }
}