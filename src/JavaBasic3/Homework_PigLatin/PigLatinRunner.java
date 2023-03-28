package JavaBasic3.Homework_PigLatin;

public class PigLatinRunner {
    public static void main(String[] args) {
        PigLatinMethodes obj = new PigLatinMethodes();
        System.out.println(obj.pigLatinConverter(Utils.Utils.scanner().nextLine().toLowerCase()));
    }
}
