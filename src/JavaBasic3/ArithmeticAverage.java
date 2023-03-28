package JavaBasic3;
/*
Sa se afle 2 numere daca media lor aritmetica  este 22 si primul impartit la al doilea da catul 3 si restul 4
(a + b)/2 = 22; a/b  = 3 rest 4;

a+b / 2 =22 => a+b=22*2=44
a:b=3 rest 4 => a=3*b+4
3*b+4+b=44
4*b+4=44
4*b=44-4
4*b=40
b=40:4
b=10

a=3*b+4
a=3*10+4
a=30+4
a=34
 */

public class ArithmeticAverage {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void showNumbers(int average) {
        int sum = average * 2;
        secondNumber = (sum - 4) / 4;
        firstNumber = 3 * secondNumber + 4;
        System.out.println("First number is: " + firstNumber);
        System.out.println("Second number is: " + secondNumber);
    }

}
