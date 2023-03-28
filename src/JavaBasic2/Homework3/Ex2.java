package JavaBasic2.Homework3;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String cuvant = scanner.nextLine();
        Ex2 word = new Ex2();
        System.out.println(word.check(cuvant));
    }

    public boolean check(String a) {
        if (a.endsWith("e")) {
            return true;
        } else {
            return false;

        }
    }
}
