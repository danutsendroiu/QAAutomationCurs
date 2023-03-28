package Colections;

import Utils.Utils;

public class IntegerToString {
    public static void main(String[] args) {
        int number = Utils.scanner().nextInt();
        IntegerToString object = new IntegerToString();
        System.out.println(object.convertIntegerToString(number));

    }
    public String convertIntegerToString(int value){
        String numbers = String.valueOf(Integer.parseInt(String.valueOf(value)));

        return numbers;
    }
}
