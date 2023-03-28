package Utils;

import java.util.Random;
import java.util.Scanner;

public class Utils {
    public static Scanner scanner() {
        System.out.println("Enter a number or a text: ");
        return new Scanner(System.in);
    }
    public static int randomNumber(int bound){
        Random random = new Random();
        return random.nextInt(bound);
   }
}
