package src.fr.algorithmie;

import java.util.Arrays;

public class ComparaisonTableau {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;

        int valueArray = array1.length + array2.length;

        int[] arrayCopy = new int[valueArray];
        int index = 0;

        for (int element : array1) {
            arrayCopy[index] = element;
            index++;
        }

        for (int element : array2) {
            arrayCopy[index] = element;
            index++;
        }

        System.out.println(Arrays.toString(arrayCopy));

         Arrays.sort(arrayCopy);
        System.out.println(Arrays.toString(arrayCopy));

        int counter = 0;
        for (int i = 1; i < arrayCopy.length; i++) {
            if (arrayCopy[i] == arrayCopy[i - 1]) {
                counter++;
            }
        }

            System.out.println("Nombre d'élément en double : " + counter + " fois");


    }
}
