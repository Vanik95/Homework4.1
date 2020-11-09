package com.company;

import java.util.Random;
import java.util.Scanner;

public class Homework413 {

    public static void main(String[] args) {

        Random random = new Random();
        System.out.println("Input the number:");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int inputNumber = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == inputNumber) {
                System.out.println("The index is: " + i);
            }
        }
    }
}