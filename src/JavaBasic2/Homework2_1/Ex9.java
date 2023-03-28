package JavaBasic2.Homework2_1;

import java.util.Arrays;

/*
Definiti o metoda care ia un array de numere (intregi sau cu virgula) si sa-l ordoneze crescator sau descrescator.
 */
public class Ex9 {
    public static void main(String[] args) {
        double[] nums = {3.2, 6.7, 5.8, 1.6, 2.0, 9.6};
        int[] nums1 = {1, 6, 8, 5, 9, 2, 4};
        Ex9 object = new Ex9();
        object.sortDouble(nums, true);
        object.sortInt(nums1, true);

    }

    public void sortDouble(double[] a, boolean ascending) {
        if (ascending) {
            Arrays.sort(a);
            System.out.println(Arrays.toString(a));
        } else {
            Arrays.sort(a);
            for (int i = 0; i < a.length / 2; i++) {
                double reminder = a[i];
                a[i] = a[a.length - 1 - i];
                a[a.length - 1 - i] = reminder;
                System.out.println(Arrays.toString(a));
            }
        }
    }
    public void sortInt(int[] a, boolean ascending) {
        if (ascending) {
            Arrays.sort(a);
            System.out.println(Arrays.toString(a));
        } else {
            Arrays.sort(a);
            for (int i = 0; i < a.length / 2; i++) {
                int reminder = a[i];
                a[i] = a[a.length - 1 - i];
                a[a.length - 1 - i] = reminder;
                System.out.println(Arrays.toString(a));
            }
        }
    }
}
