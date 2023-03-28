package JavaBasic2.Homework2_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Definiti un array si o lista. Determinati daca ele sunt goale sau nu.
 */
public class Ex8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        Ex8 object1 = new Ex8();
        object1.checkArray(array);
        object1.checkList(list);
        object1.compare(array, list);

    }

    public void checkArray(int[] a) {
        if (a.length == 0) {
            System.out.println("The array is empty!");
        } else {
            System.out.println("The array contains: " + Arrays.toString(a));
        }
    }

    public void checkList(List<Integer> a) {
        if (a.isEmpty()) {
            System.out.println("The list is empty!");
        } else {
            System.out.println("The list contains: " + a);
        }
    }

    public void compare(int[] a, List<Integer> b) {

        if (a.length != b.size()) {
            System.out.println("The array and list are not equal " + Arrays.toString(a) + " != " + b);
        } else {
            boolean equal = true;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b.get(i)) {
                    equal = false;
                    break;
                }

            }
            if (equal) {
                System.out.println("The array and list are equal " + Arrays.toString(a) + " = " + b);
            } else {
                System.out.println("The array and list are not equal " + Arrays.toString(a) + " != " + b);
            }
        }
    }
}
