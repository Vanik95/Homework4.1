package com.company;

import java.util.Random;

public class Homework4110 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[10];
        int number = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    number = array[i];
                    array[i] = array[j];
                    array[j] = number;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        System.out.println("The second element is: " + array[8]);
    }
}