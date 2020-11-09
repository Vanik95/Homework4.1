package com.company;

import java.util.Random;

public class Homework415 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] arrOld = new int[10];
        int[] arrNew = new int[arrOld.length];
        arrOld = arrNew;

        for (int i = 0; i < arrOld.length; i++) {
            arrOld[i] = random.nextInt(100);
        }
        System.out.println("Old");
        for (int i = 0; i < arrOld.length; i++) {
            System.out.print(arrOld[i] + ", ");
        }
        System.out.println();
        System.out.println("New");
        for (int i = 0; i < arrNew.length; i++) {
            System.out.print(arrNew[i] + ", ");
        }
    }
}