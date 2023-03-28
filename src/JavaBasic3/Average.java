package JavaBasic3;

/*
a+b+c/3 =14
a+b+c =14*3
a+b+c =42
a=b+7
c=3b
b+7 +b + 3b =42
5b =42-7 =35
b =7
a =b+7 =7+7 =14
c =3b =3*7 =21
 */
public class Average {
    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void average() {
        int average = (a + b + c) / 3;
        if (average > 5 && average < 10) {
            System.out.println("Media mai mare ca 5");
        } else if (average > 10) {
            System.out.println("Media mai mare ca 10");
        } else if (average < 3) {
            System.out.println("Valoarea este " + (average / 1.5));
        } else {
            System.out.println("Valoare in afara conditiilor");
        }
    }

    public int average2() {
        return (a + b + c) / 3;
    }

    public void showNumbers1(int average, int diferenceBetweenFirsAndSecond, int diferenceBetweenSecondAndThird) {
        int sum = average * 3;
        int reminder = sum - diferenceBetweenFirsAndSecond;
        b = reminder / 5;
        System.out.println("The value of a is: " + (a = b + diferenceBetweenFirsAndSecond));
        System.out.println("The value of b is: " + b);
        System.out.println("The value of c is: " + (c = diferenceBetweenSecondAndThird * b));
    }

}
