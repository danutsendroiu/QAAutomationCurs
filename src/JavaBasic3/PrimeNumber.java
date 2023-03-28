package JavaBasic3;

public class PrimeNumber {

    public void checkNumberIfPrime(int number) {

        if (number >= 2) {
            for (int i = 2; i <= number; i++) {
                int count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }

                }
                if (count == 2) {
                    System.out.println("The number is prime " + i);
                }
//                else {
//                    System.out.println("The number is not prime " + i);
//                }

            }

        }

    }

    public void checkNumberIsPrime2(int number) {
        if (number >= 2) {
            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }

            }
            if (count == 2) {
                System.out.println("Prime number");
            }
            else {
                System.out.println("Not a prime number");
            }
        }
    }

    public void checkArray(int[] number) {
        for (int i = 0; i < number.length; i++) {
            checkNumberIsPrime2(number[i]);
        }
    }
}
