package com.teachmeskills.lesson12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Print the text:");
        String inputText = scanner.nextLine();

        extractInformation(inputText);
    }

    private static void extractInformation(String text) {
        String emailPattern = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        String documentPattern = "\\d{4}-\\d{4}-\\d{2}";
        String phonePattern = "\\+\\(\\d{2}\\)\\d{7}";

        Pattern emailRegex = Pattern.compile(emailPattern);
        Pattern documentRegex = Pattern.compile(documentPattern);
        Pattern phoneRegex = Pattern.compile(phonePattern);

        Matcher emailMatcher = emailRegex.matcher(text);
        Matcher documentMatcher = documentRegex.matcher(text);
        Matcher phoneMatcher = phoneRegex.matcher(text);

        System.out.println("Information:");

        while (emailMatcher.find()) {
            System.out.println("email: " + emailMatcher.group());
        }

        while (documentMatcher.find()) {
            System.out.println("document number: " + documentMatcher.group());
        }

        while (phoneMatcher.find()) {
            System.out.println("phone number: " + phoneMatcher.group());
        }

    }

}
