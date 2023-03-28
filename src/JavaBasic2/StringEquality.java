package JavaBasic2;

import java.util.Scanner;

public class StringEquality {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();


        if (str1.equals(str2)) {
            System.out.println("The two strings are equal.");
        } else {
            System.out.println("The two strings are not equal.");
        }

        int result = str1.compareTo(str2);
        if (result < 0) {
            System.out.println("The first string comes before the second string.");
        } else if (result > 0) {
            System.out.println("The first string comes after the second string.");
        } else {
            System.out.println("The two strings are equal.");
        }
    }
}

