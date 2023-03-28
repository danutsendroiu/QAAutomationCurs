package Colections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("caine");
        list.add("pisica");
        list.add("soricel");
        list.add("cal");
        list.add("gaina");

        System.out.println(list);
        System.out.println(list.size());

        list.remove("pisica");
        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.get(2));

        System.out.println("First element: " + list.get(0));
        System.out.println("Last element: " + list.get(list.size() - 1));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
