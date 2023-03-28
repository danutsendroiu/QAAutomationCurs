package JavaBasic2.Homework3;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = scanner.nextLine();
        System.out.println(word.contains("b"));
    }

}
