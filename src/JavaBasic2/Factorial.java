package JavaBasic2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int x = input.nextInt();
        int factorialX = calculateFactorial(x);
        System.out.println("The factorial of " + x + " is " + factorialX);


    }

    public static int calculateFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;

        }
        return factorial;
    }
}
