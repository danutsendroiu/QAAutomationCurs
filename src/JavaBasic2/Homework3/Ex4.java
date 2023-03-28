package JavaBasic2.Homework3;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

//        Transform an int to a String
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = scanner.nextInt();
        String covertedNumber = String.valueOf(a);
        System.out.println(covertedNumber);

    }
}
