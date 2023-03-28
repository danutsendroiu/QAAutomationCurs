package Test;

public class PrimeNumbers {
    public static void main(String[] args) {
        int value = 1000;
        System.out.print("Prime numbers until " + value + ": ");


        for (int i = 2; i <= value; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;

                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
