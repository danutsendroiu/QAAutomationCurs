package JavaBasic3;

import java.util.Scanner;

public class CnpVerifier {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter CNP");
        String cnp = input.next();

        boolean isValid = verifyCNP(cnp);
        if (isValid) {
            System.out.println("CNP-ul introdus este valid!");
        } else {
            System.out.println("CNP-ul introdus nu este valid!");
        }


    }

    public static boolean verifyCNP(String cnp) {
        if (cnp == null || cnp.length() != 13) {
            return false;
        }
        final int[] numbers = {2, 7, 9, 1, 4, 6, 3, 5, 8, 2, 7, 9};
//                             1, 8, 5, 0, 9, 1, 5, 1, 8, 0, 0, 5, 1

        int sum = 0;
        for (int i = 0; i < 12; i++) {
            int digit = cnp.charAt(i) - '0';
            if (digit < 0 || digit > 9) {
                return false;
            }
            sum += digit * numbers[i];

        }
        int checkDigit = cnp.charAt(12) - '0';
        if (checkDigit < 0 || checkDigit > 9) {
            return false;
        }
        int reminder = sum % 11;
        if (reminder == 10) {
            reminder = 1;
        }
        return reminder == checkDigit;
    }

}

