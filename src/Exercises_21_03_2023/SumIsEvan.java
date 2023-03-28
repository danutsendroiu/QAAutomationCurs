package Exercises_21_03_2023;

public class SumIsEvan {
    public static void main(String[] args) {
        SumIsEvan object = new SumIsEvan();
        object.sumOfIndexIsEvan();

    }
    public void sumOfIndexIsEvan(){
        for (int i = 100; i <=150 ; i++) {
            int sum = 0;
            int num = i;

            while(num !=0){
                sum += num%10;
                num /=10;
            }
            if (sum%2 == 0){
                System.out.println(i);
            }
        }

    }
}
