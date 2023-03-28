package JavaBasic3.Homework_PigLatin;

public class PigLatinMethodes {
    final String vowel = "aeiou";

    public boolean checkVowel(char a) {
        int i = 0;
        return a == vowel.charAt(i);
    }

    public String pigLatinConverter(String word) {
        if (checkVowel(word.charAt(0)) || word.startsWith("xr") || word.startsWith("yt")) {
            return word + "ay";
        } else {
            int index1 = 0;
            for (int i = 1; i < word.length(); i++) {
                if (checkVowel(word.charAt(i)) && word.charAt(i) != 'u') {
                    index1 = i;
                    break;
                }
                if (checkVowel(word.charAt(i)) && word.charAt(i) == 'u') {
                    if (word.charAt(i - 1) == 'q') {
                        index1 = i + 1;
                    } else {
                        index1 = i;
                    }
                    break;
                }
                if (word.charAt(i) != 'y') {
                    continue;
                }
                boolean onlyConstant = true;
                for (int j = 0; j < 1; j++) {
                    if (checkVowel(word.charAt(j))) {
                        onlyConstant = false;
                        break;
                    }

                }
                if (!onlyConstant) {
                    continue;
                }
                index1 = i;
                break;
            }
            return word.substring(index1) + word.substring(0, index1) + "ay";
        }
    }

}

