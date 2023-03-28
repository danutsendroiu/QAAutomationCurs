package JavaBasic2.Homework2_1;

import java.util.ArrayList;
import java.util.List;

/*
Definiti o lista de Integer, de 5 elemente. Calculati suma tuturor elementelor.
 */
public class Ex7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Ex7 object = new Ex7();
        object.sumOfIndex(list);

    }

    public void sumOfIndex(List<Integer> index) {
        int sum = 0;
        for (int i = 0; i <= index.size(); i++) {
            sum += i;

        }
        System.out.println(sum);
    }
}
