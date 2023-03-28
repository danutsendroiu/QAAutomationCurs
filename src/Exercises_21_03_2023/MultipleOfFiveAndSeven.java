package Exercises_21_03_2023;

/*
        Java program to check whether the given integer is a multiple of 5
        Java program to check whether the given integer is a multiple of both 5 and 7
 */
public class MultipleOfFiveAndSeven {
    public static void main(String[] args) {
        MultipleOfFiveAndSeven object = new MultipleOfFiveAndSeven();
        object.checkMultiple(Utils.Utils.scanner().nextInt());


    }

    public void checkMultiple(int number) {

        if (number % 5 == 0) {
            System.out.println("The number: " + number + " is a multiple of 5");
        } else if (number % 7 == 0) {
            System.out.println("The number: " + number + " is a multiple of 7");
        } else {
            System.out.println("The number is not a multiple of five or seven");
        }

    }
}
