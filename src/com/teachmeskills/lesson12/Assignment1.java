package com.teachmeskills.lesson12;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        String input = scanner.nextLine();

        findAbbreviations(input);
    }

    private static void findAbbreviations(String input) {
        String[] words = input.split("\\s+");

        System.out.println("Abbreviation:");

        for (String word : words) {
            if (isAbbreviation(word)) {
                System.out.println(word);
            }
        }
    }

    private static boolean isAbbreviation(String word) {
        return word.length() >= 2 && word.length() <= 6 && word.matches("[A-Z]+");
    }
}
