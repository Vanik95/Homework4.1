package com.company;

import java.util.Random;

public class Homework416 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[10];
        int minNumber = array[0];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        System.out.println("Minimum number is: " + minNumber);
    }
}