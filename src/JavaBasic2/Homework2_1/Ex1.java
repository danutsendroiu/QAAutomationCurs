package JavaBasic2.Homework2_1;

import Utils.Utils;

public class Ex1 {
    public static void main(String[] args) {
        Ex1 object = new Ex1();
        object.compareNumbers(100);
        object.compareNumbersVersion1(100);

    }

    public void compareNumbers(int i) {
        int a = Utils.scanner().nextInt();
        int b = Utils.randomNumber(i);
        if (a < b) {
            System.out.println(b);
            System.out.println("Numarul random este mai mare decat a: " + a + " < " + b);
        } else {
            System.out.println(b);
            System.out.println("Numarul random este mai mic decat a: " + a + " > " + b);
        }

    }

    public void compareNumbersVersion1(int i) {

        int a = Utils.scanner().nextInt();
        if (a < Utils.randomNumber(i)) {
            System.out.println(Utils.randomNumber(i));
            System.out.println("Numarul random este mai mare decat a: " + a + " < " + Utils.randomNumber(100));
        } else {
            System.out.println(Utils.randomNumber(i));
            System.out.println("Numarul random este mai mic decat a: " + a + " > " + Utils.randomNumber(100));
        }

    }

}
