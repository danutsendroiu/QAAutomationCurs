package Colections;

import java.util.ArrayList;

public class StringToLong {
    public static void main(String[] args) {
        StringToLong object = new StringToLong();
        System.out.println(object.longList(Utils.Utils.scanner().next()));

    }
    public long convertLongToString (String value){
        long number = Long.parseLong(value);
        return number;
    }
    public Long longList (String value){
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(convertLongToString(value));

        return (Long) arrayList.get(0);
    }
}
