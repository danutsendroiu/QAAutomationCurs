package Exercises_21_03_2023;
/*
 Java Program to Check Whether the Generated Random Number Is Even or Odd
 */

import Utils.Utils;

import java.util.Random;

public class CheckIfRandomIsEvenOrOdd {
    public static void main(String[] args) {
        CheckIfRandomIsEvenOrOdd object = new CheckIfRandomIsEvenOrOdd();
        object.oddOrEven(Utils.randomNumber(99000));

    }

    public void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }

}
