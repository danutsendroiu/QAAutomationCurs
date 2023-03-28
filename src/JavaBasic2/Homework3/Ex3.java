package JavaBasic2.Homework3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String word = scanner.nextLine();
        System.out.println(word.indexOf("fun"));

    }
}
