package com.company;

import java.util.Random;

public class Homework417 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] == array[j]) && (i != j)) {
                    System.out.println("Duplicate Element : " + array[j]);
                }
            }
        }
    }
}