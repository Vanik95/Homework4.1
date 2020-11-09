package com.company;

import java.util.Random;

public class Homework411 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[10];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("The values of array is:");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        System.out.println();
        System.out.print("The sum is: " + sum);
    }
}