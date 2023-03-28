package JavaBasic2;

public class ReverseNumber {
    public static void main(String[] args) {
        ReverseNumber reverseNumber = new ReverseNumber();
        System.out.println(reverseNumber.reverse(Utils.Utils.scanner().nextInt()));
        System.out.println(reverseNumber.reverse2(Utils.Utils.scanner().nextInt()));
        reverseNumber.check(Utils.Utils.scanner().nextInt());
        System.out.println(reverseNumber.palindromV2(Utils.Utils.scanner().next()));
    }

    public int reverse(int number) {

        int val = 0;

        while (number > 0) {
            val = val * 10 + number % 10;
            number = number / 10;
        }

        return val;
    }

    public int reverse2(int number) {

        int r, sum = 0;
        while (number > 0) {
            r = number % 10;

            sum = sum * 10 + r;
            number = number / 10;

        }
        return sum;
    }

    public void check(int n) {

        if (reverse(n) == n) {
            System.out.println("The values are true");
        } else {
            System.out.println("There are diferences");
        }
    }
    public String palindromV2(String val) {
        String palindrom = "";
        for (int i = val.length() - 1; i >= 0; i--) {
            palindrom = palindrom + val.charAt(i);
        }
        return val.equals(palindrom) ? "Este palindrom" : "Nu este palindrom";
    }
}
