package JavaBasic2.Homework;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to start count: ");
        int minNumber = scanner.nextInt();
        System.out.println("Enter a number to stop count: ");
        int maxNumber = scanner.nextInt();

        displayPrimeNumbers(minNumber,maxNumber);

    }
    public static void displayPrimeNumbers(int a,  int b){
        while (a<b){
            boolean count = false;
            for (int i = 2; i < a/2 ; i++) {
                if(a % i == 0){
                    count = true;
                    break;
                }
            }
            if (!count)
                System.out.println(a);
                a++;

        }
    }
}
