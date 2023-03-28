package JavaBasic2.Homework3;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
//        Replace a char element with another char element from a string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String str = scanner.nextLine();
        char[] str1 = str.toCharArray();
        str1[6] = 'E';
        str = String.valueOf(str1);
        System.out.println(str);


    }
}
