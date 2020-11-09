package com.company;

public class Homework418 {

    public static void main(String[] args) {

        String[] array1 = {"1", "8", "6", "12", "20", "10"};
        String[] array2 = {"18", "28", "6", "120", "20"};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if ((array1[i]).equals(array2[j])) {
                    System.out.println("Common elements : " + array1[j]);
                }
            }
        }
    }
}