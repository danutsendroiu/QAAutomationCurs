package JavaBasic2.Homework;

import java.util.Scanner;

public class CheckIfNumberIsArmstrong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        checkNumberIsArmstrong(number);
    }

    public static void checkNumberIsArmstrong(int a) {
        int originalNumber;
        int remainder;
        int result = 0;
        int n = 0;

        originalNumber = a;

        // numara numarul de cifre din numarul citit de la tastatura
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = a;

        // calculeaza suma puterii (n la puterea numarului indexilor din numar) a fiecarei cifre
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        if (result == a)
            System.out.println(a + " is an Armstrong number.");
        else
            System.out.println(a + " is not an Armstrong number.");
    }
}

