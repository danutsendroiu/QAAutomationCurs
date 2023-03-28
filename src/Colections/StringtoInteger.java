package Colections;

import Utils.Utils;

public class StringtoInteger {
    public static void main(String[] args) {
        String string = Utils.scanner().nextLine();
        int numbers = Integer.parseInt(string);
        System.out.println(numbers);
        StringtoInteger object = new StringtoInteger();
        System.out.println(object.convertStringtoInteger(string));
        System.out.println(object.convertIntToText(Utils.scanner().nextInt())+" "+object.convertIntToText(Utils.scanner().nextInt()));

    }
    public int convertStringtoInteger(String value){
        int numbers = Integer.parseInt(value);

        return numbers;
    }
    public String convertIntToText (int value){
        switch (value){
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 0:
                return "zero";
            default:
                return "Out of area";

        }

    }
}
