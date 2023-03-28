package JavaBasic2;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();


        System.out.print("The temperature in Celsius is: " + fahrenheitCelsius(fahrenheit));
    }
    public static double fahrenheitCelsius(double fahrenheit){
        return (fahrenheit-32)*5/9;
    }
}
