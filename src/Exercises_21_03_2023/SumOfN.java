package Exercises_21_03_2023;
/*
Java program to display the sum of n numbers using an array
 */

public class SumOfN {
    public static void main(String[] args) {
        SumOfN object = new SumOfN();
        int[] array1 = {1,5,3,6,5};
        System.out.println(object.sumOfN(array1));

    }
    public int sumOfN(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum =sum + array[i];

        }
        return sum;
    }
}
