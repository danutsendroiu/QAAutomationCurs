package Exercises_21_03_2023;

import Utils.Utils;

import java.util.Arrays;

/*
    Java program to implement linear search
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Utils.randomNumber(10);
        }
        LinearSearch object = new LinearSearch();
        System.out.println(Arrays.toString(array));
        object.verify(array, 5);

    }

    public void verify(int[] very, int index) {
        for (int i = 0; i < very.length; i++) {
            if (very[i] == index) {
                System.out.println("Element found: " + very[i] + "  " + index);
            } else {
                System.out.println("Element not found: " + very[i]);
            }
        }
    }
}
