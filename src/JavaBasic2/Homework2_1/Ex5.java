package JavaBasic2.Homework2_1;

public class Ex5 {
    public static void main(String[] args) {
        double[] doubles = {2.5, 3.6, 4.5, 3.8, 1.2, 2.4, 6.3, 7.5};
        Ex5 object = new Ex5();
        object.printValues(doubles);
    }

    public void printValues(double[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 4.5) {
                System.out.println(a[i]);
            } else if (a[i] > 5) {
                System.out.println("Element peste 5");

            } else {
                System.out.println(a[i]);
            }
        }
    }

}
