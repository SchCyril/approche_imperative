package src.fr.algorithmie;

import java.util.Arrays;
import java.util.stream.Stream;

public class SommeDeTableaux {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};

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


    }
}
