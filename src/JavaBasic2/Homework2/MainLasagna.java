package JavaBasic2.Homework2;

import java.util.Scanner;

public class MainLasagna {
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of minutes elapsed: ");
        int numberOfMinutesElapsed = scanner.nextInt();
        System.out.println("Enter a number of layers for your lasagna: ");
        int numberOfLayers = scanner.nextInt();

        System.out.println("Expected time for lasagna to cook: " + lasagna.expectedMinutesInOven() + " minutes");
        System.out.println("Expected time for the lasagna to stay in the oven to be cooked : " + lasagna.remainingMinutesInOven(numberOfMinutesElapsed) + " minutes");
        System.out.println("Expected time to prepare the lasagna before putting it in the oven: " + lasagna.preparationTimeInMinutes(numberOfLayers) + " minutes");
        System.out.println("Total working time: " + lasagna.totalTimeInMinutes(numberOfLayers,numberOfMinutesElapsed) + " minutes");
    }
}
