package JavaBasic1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Danut");
        System.out.println(sumOfTwo(12.5, 123.24));
        System.out.println(divideOfTwo(123.24,12.5));





    }

    //    Write a Java program to print the sum of two numbers: a = 12.5, b = 123.24;
    public static double sumOfTwo(double a, double b) {
        return a + b;
    }

    //    Write a Java program to divide two numbers and print on the screen: z = 275, v = 25,
    //    c= salvati rezultatul in aceasta variabila ;
    public static int divideOfTwo(double z, double v) {
        int c = (int) (z / v);
        return c;
    }

    //    Write a Java program to print the result of the following operations:
    //    a. -10 + 3+7;
    //	b. (34+5) % 3/sau 2 – incercati ambele variante;
    //    c. 20 + -3*5/2;
    //    d. 5 + 25/5*2 – 6*8%2;



}