package JavaBasic2.Homework3;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
//        Find length and concate a String
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String word = scanner.nextLine();
        System.out.println("Enter 2nd sentence: ");
        String word2 = scanner.nextLine();
        int a = word.length() + 1;
        int b = word2.length() + 1;
        System.out.println("The number of characters in the sentence are: " + a + " and " + b);

        String wordConcat = word.concat(" " + word2);
        String wordConcat2 = word + " " + word2;
        System.out.println(wordConcat);
        System.out.println(wordConcat2);

    }
}
