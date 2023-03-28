package JavaBasic2;

import Utils.Utils;

public class ComputeInteger {
    public static void main(String[] args) {
        ComputeInteger object = new ComputeInteger();
        System.out.println("The sum of digits of the given number is: " + object.sumOfDigits(Utils.scanner().nextInt()));

    }
    public int sumOfDigits(int number){
        int sum = 0;
        while(number!=0){
            sum += number%10;
            number/=10;
        }
        return sum;

    }
}
