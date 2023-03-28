package JavaBasic2.Homework;

public class ArmstrongNumbers {

    public static void main(String[] args) {

        for (int i = 0; i <= 9999; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " is an Armstrong number.");
            }
        }
    }

    public static boolean isArmstrong(int number) {
        int sum = 0;
        int originalNum = number;
        int numDigits = String.valueOf(number).length();
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
        return sum == originalNum;
    }
}
