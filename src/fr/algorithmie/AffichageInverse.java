package src.fr.algorithmie;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AffichageInverse {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};


        //Afficher l’ensemble des éléments du tableau grâce à une boucle
        for (int i : array) {
            System.out.println("Les éléments du tableau : " + i);
        }

        // Afficher l’ensemble des éléments dans l’ordre inverse du tableau
        for (int i = array.length -1 ; i >=0 ; i--) {
            System.out.println("valeur de reversed : " + array[i]);
        }



        int[] arrayCopy = Arrays.copyOf(array, array.length);
        for (int i : arrayCopy) {
            System.out.println("Valeur de arrayCopy : " + i);
        }
    }
}
