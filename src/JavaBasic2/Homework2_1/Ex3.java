package JavaBasic2.Homework2_1;
/*
    Definiti un array de 2 dimensiuni, fiecare dimensiune sa aiba cate 3, respectiv 5 elemente.
    Initializati array-ul.
    Afisati primele si ultimele elemente din fiecare dimensiune pe ecran.
 */
public class Ex3 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        Ex3 object  = new Ex3();
        object.displayElements(array);

    }
    public void displayElements (int[][] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("First element of row " + (i+1) + " is: " + array[i][0]);
            System.out.println("Last element of row " + (i+1) + " is: " + array[i][array[i].length-1]);

        }
    }
}
