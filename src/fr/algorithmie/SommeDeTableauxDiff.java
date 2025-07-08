package src.fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};

        int[] sommeArray = new int[Math.max(array1.length, array2.length)];

        for (int i = 0; i < sommeArray.length; i++) {
            int value1 = 0;

            value1 = array1[i];
            int value2 = 0;
            if (i < array2.length) {
                value2 = array2[i];
            }

            sommeArray[i] = value1 + value2;
        }
        System.out.println(Arrays.toString(sommeArray));
    }
}

