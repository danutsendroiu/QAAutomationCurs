package Exercises_21_03_2023;

public class MultipleOf3 {
    public static void main(String[] args) {
        MultipleOf3 object = new MultipleOf3();
        object.MultipleOf3(10,50);

    }
    public void MultipleOf3(int number1, int number2){
        for (int i = number1; i < number2 ; i++) {
            if (i%3 == 0){
                System.out.println(i);
            }

        }
    }
}
