package JavaBasic2.Homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
//        Split the string based on whitespace
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String word = scanner.nextLine();
        String[] word2 = word.split(" ");
        System.out.println(word);
        System.out.println(Arrays.toString(word2));

    }
}
