package Exercises_21_03_2023;
/*
 Se da un numar de la tastatura cuprins intre 1000 si 9999 . Calculati suma numerelor de pe index ul 1 si index ul 3
 */
public class SumOfNums {
    public static void main(String[] args) {
        SumOfNums object = new SumOfNums();
        System.out.println(object.sumOf1And3(Utils.Utils.scanner().nextInt()));
    }
    public String sumOf1And3 (int number){
        int digit1 = (number/100)%10;
        int digit3 = number%10;
        int sum = digit1 + digit3;
        return String.valueOf(sum);
    }

}
