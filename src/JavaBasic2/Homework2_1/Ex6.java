package JavaBasic2.Homework2_1;

import java.util.Arrays;

/*
    Definiti un array cu 9 elemente si parcugeti-l cu structura for (tipul de date este la alegere).
    Daca iteratia este la indexul 2, sa se sara peste.
    Daca iteratia este la indexul 7, sa se opreasca iteratia.
    Altfel, sa se afiseze mesajul “Index valid” pe ecran.
 */
public class Ex6 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Ex6 object = new Ex6();
        object.response(num);

    }

    public void response(int[] a) {

        for (int i = 0; i < a.length; i++) {
            if (i == 2) {
                i += 0;
            } else if (i == 7) {
                break;
            } else {
                System.out.println(Arrays.toString(new int[]{a[i]}) + "Index valid");
            }

        }

    }
}
