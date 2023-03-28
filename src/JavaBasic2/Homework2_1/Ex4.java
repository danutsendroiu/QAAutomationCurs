package JavaBasic2.Homework2_1;

/*
Definiti un array de char-uri. Iterati array-ul folosind structura for, si afisati pe ecran cate al doilea caracter din sir
 */
public class Ex4 {
    public static void main(String[] args) {

        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f', 'v', 'u'};
        Ex4 object = new Ex4();
        object.printEvenChar(charArray);
        object.printEvenChar1(charArray);

    }

    public void printEvenChar(char[] args) {
        for (int i = 0; i < args.length; i += 2) {
            if (i % 2 == 0) {
                System.out.print(args[i]);
            }
        }
    }

    public void printEvenChar1(char[] args) {
        for (int i = 0; i < args.length; i++) {
            if (i % 2 == 0) {
                System.out.print(args[i]);
            }
        }
    }
}
