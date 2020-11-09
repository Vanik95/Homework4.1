package com.company;

import java.util.Scanner;

public class Homework4112 {

    public static void main(String[] args) {

        System.out.println("Enter the word:");
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int length = text.length();

        boolean palindrome = true;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != text.charAt(length - 1 - i)) {
                System.out.println("Not a palindrome.");
                palindrome = false;
                break;
            }
        }

        if (palindrome) {
            System.out.println("Palindrome.");
        }
    }
}