package JavaBasic2.Homework;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = numbers.nextInt();
        System.out.println("Enter second number: ");
        int b = numbers.nextInt();
        System.out.println("Enter third number: ");
        int c = numbers.nextInt();

        bigestNumberOfAll(a, b, c);

    }

    public static void bigestNumberOfAll(int a, int b, int c) {

        int bigestNumber = a;

        if (b > bigestNumber) {
            bigestNumber = b;
        }
        if (c > bigestNumber) {
            bigestNumber = c;
        }
        System.out.println("The bigest number is: " + bigestNumber);
    }


}
