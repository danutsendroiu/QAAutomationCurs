package Colections;

import java.util.LinkedList;

public class LinkedListProgram {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("caine");
        linkedList.add("pisica");
        linkedList.add("soricel");
        linkedList.add("gaina");

        System.out.println(linkedList);

        linkedList.remove(2);

        System.out.println(linkedList);

        System.out.println(linkedList.get(2));

        System.out.println(linkedList.size());
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        linkedList.add("cal");
        System.out.println(linkedList.indexOf("gaina"));
        System.out.println(linkedList.indexOf("gaina"));


    }

}
