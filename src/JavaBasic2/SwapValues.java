package JavaBasic2;

import java.util.Scanner;

public class SwapValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int value1 = scanner.nextInt();
        System.out.println("Enter the second value: ");
        int value2 = scanner.nextInt();
        swapValues(value1, value2);
        swapValues1(value1,value2);

    }
    public static void swapValues (double a, double b){
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    public static void swapValues1(double a, double b){
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        double temp = a;
        a = b;
        b=temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);

    }
}
