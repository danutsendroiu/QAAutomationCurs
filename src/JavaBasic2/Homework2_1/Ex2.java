package JavaBasic2.Homework2_1;

import Utils.Utils;
import jdk.jshell.execution.Util;

/*        Citit un caracter si 2 numere de la tastatura, si stocati-le in variabile.
        Folosind structura switch, daca s-a introdus un caracter anume,
        realizati operatia respectiva cu cele 2 numere, si afisati rezultatul pe ecran:
        -‘a’: adaugare
        -‘s’: scadere
        -‘i’: inmultire
        -‘p’: impartire
        -‘m’: modul
       Daca nu s-a introdus un caracter valid, afisati un mesaj de eroare.
 */
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        double number1 = Utils.scanner().nextDouble();
        System.out.println("Enter second number");
        double number2 = Utils.scanner().nextDouble();
        System.out.println("Enter character");
        String calc = Utils.scanner().next();

        Ex2 object = new Ex2();
        System.out.println(object.calculator(number1, number2, calc));


    }

    public double calculator(double a, double b, String rez) {

        if (a != 0 && b != 0 && a + b != 70) {
            switch (rez.charAt(0)) {
                case 'a':
                    return a + b;
                case 's':
                    return a - b;
                case 'i':
                    return a * b;
                case 'p':
                    return a / b;
                case 'm':
                    return a % b;
                default:
                    throw new IllegalArgumentException("Valoarea aritmetica nu este corecta!");
            }
        } else {
            System.out.println("Executa calculator:");
            throw new IllegalArgumentException("Nu se indeplinesc primele conditii");

        }

    }
}