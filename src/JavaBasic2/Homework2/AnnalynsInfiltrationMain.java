package JavaBasic2.Homework2;

import java.util.Scanner;

public class AnnalynsInfiltrationMain {
    public static void main(String[] args) {
//      This is a class to creata a object for implementing the methods
        AnnalynsInfiltrationMethode annalynsInfiltrationMain = new AnnalynsInfiltrationMethode();
        Scanner scanner = new Scanner(System.in);
//      This scanner reads from the keyboard the state of the variable (true for the "awake" state and false for the "sleeping" state
        System.out.println("Enter the state of the knight: awake = true or asleep = false ");
        boolean knightState = scanner.nextBoolean();
//      This scanner reads from the keyboard the state of the variable (true for the "awake" state and false for the "sleeping" state
        System.out.println("Enter the state of the archer: awake = true or asleep = false ");
        boolean archerState = scanner.nextBoolean();
//      This scanner reads from the keyboard the state of the variable (true for the "awake" state and false for the "sleeping" state
        System.out.println("Enter the state of the prisoner: awake = true or asleep = false ");
        boolean prisonerState = scanner.nextBoolean();
//      This scanner reads from the keyboard the state of the variable (true for the "awake" state and false for the "sleeping" state
        System.out.println("Enter if the dog is present or not: present = true or not present = false ");
        boolean dogState = scanner.nextBoolean();


        System.out.println("This method print if a fast attack can be made: ");
        System.out.println(annalynsInfiltrationMain.canFastAttack(knightState));
        System.out.println("This method shows whether it can be spied on or not : ");
        System.out.println(annalynsInfiltrationMain.canSpy(knightState, archerState, prisonerState));
        System.out.println("This method shows if Annalyn can signal the prisoner or not : ");
        System.out.println(annalynsInfiltrationMain.canSignalPrisoner(archerState, prisonerState));
        System.out.println("This method shows if Annalyn can free the prisoner or not : ");
        System.out.println(annalynsInfiltrationMain.canFreePrisoner(knightState, archerState, prisonerState, dogState));


    }

}
