package JavaBasic2;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first value: ");
        int a = input.nextInt();
        System.out.println("Enter second value: ");
        int b = input.nextInt();

//        checkOddEven(a);
//        checkOddEven(b);
        checkOddEven(a, b);

    }

    public static void checkOddEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }

    public static void checkOddEven(int c, int d) {
        if (c % 2 == 0) {
            System.out.println("The first number is even");
        }
        if (d % 2 == 0) {
            System.out.println("The second number is even");
        }
        if (c % 2 != 0) {
            System.out.println("The first number is odd");
        }
        if (d % 2 != 0) {
            System.out.println("The second number is odd");
        }
    }
}
