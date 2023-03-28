package JavaBasic2.Homework3;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String str = scanner.nextLine();
        System.out.println("Initial string is: " + str);
        str = str.replaceAll("world","Danut");
        System.out.println("The String after substitution is: " + str);
    }
}
