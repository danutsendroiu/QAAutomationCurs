package JavaBasic2;

import java.util.Scanner;

public class SquareDifference {
    //    Find the difference between the square of the sum and the sum of the squares of the first N natural numbers.
//    The square of the sum of the first ten natural numbers is (1 + 2 + ... + 10)² = 55² = 3025.
//    1) The sum of the squares of the first ten natural numbers is 1² + 2² + ... + 10² = 385.
//    Hence the difference between the square of the sum of the first ten natural numbers
//    and the sum of the squares of the first ten natural numbers is 3025 - 385 = 2640.
//    You are not expected to discover an efficient solution to this yourself from first principles;
//    research is allowed, indeed, encouraged. Finding the best algorithm for the problem is a key skill in software engineering.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        SquareDifference diferenta = new SquareDifference();
        System.out.println(diferenta.diference(number));
    }


    public static int squaresOfSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return (int) Math.pow(sum, 2);
    }

    public static int sumOfSquare(int n) {
        int squareSum = 0;
        for (int i = 1; i <= n; i++) {
            squareSum = (int) (squareSum + Math.pow(i, 2));
        }
        return squareSum;
    }

    public int diference(int n) {
        return squaresOfSum(n) - sumOfSquare(n);
    }

}

