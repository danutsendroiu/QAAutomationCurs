package JavaBasic2.Homework;

import java.util.Scanner;

public class StringPalidrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to check if it is palidrome or not");
        String word = scanner.nextLine();

        checkIfWordIsPalidrome(word);

        checkIfWordIsPalidrome2(word);
    }
    public static void checkIfWordIsPalidrome(String word){

        boolean isPalidrome = true;

        for (int i = 0; i < word.length()/2; i++) {
            if(word.charAt(i) != word.charAt(word.length()-i-1)){
                isPalidrome = false;
                break;
            }

        }
        if(isPalidrome){
            System.out.println(word + " is a palidrome");
        }else{
            System.out.println(word + " is not a palidrome");
        }
    }

    public static void checkIfWordIsPalidrome2 (String word){
        StringBuilder stringBuilder = new StringBuilder(word);
        String reverseString = stringBuilder.reverse().toString();

        if(word.equals(reverseString)){
            System.out.println(word + " is a palidrome");
        }else {
            System.out.println(word + " is not a palidrome");
        }
    }
}
