package JavaBasic3;

import java.util.Random;

public class Valori {

    public static String randomString() {
        Random random = new Random();
        char[] chars = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s'};
        String nume = "";
        for (int i = 0; i < 5; i++) {
            nume = nume + chars[random.nextInt(chars.length)];
        }

        return nume;
    }

    public static int randomInt() {
        Random random = new Random();
        int number = random.nextInt(40);
        return number;
    }

}
