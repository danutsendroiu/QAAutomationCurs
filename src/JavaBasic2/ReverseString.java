package JavaBasic2;

import Utils.Utils;

import java.util.Scanner;

public class ReverseString {
    //    2) Reverse a string
//   For example: input: "cool" output: "looc"
//   For more help on how to solve this exercise, please refer to the tutorial provided as part of the hello world exercise.
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverse(Utils.scanner().next()));

    }

    public String reverse(String string) {

        char[] elementChar = string.toCharArray();
        char[] reversedVal = new char[string.length()];
        int j = 0;

        for (int i = string.length() - 1; i >= 0; i--) {
            reversedVal[j++] = elementChar[i];
        }
        return String.valueOf(reversedVal);
    }

}
