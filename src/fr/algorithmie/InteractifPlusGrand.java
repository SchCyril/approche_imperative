package src.fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre;
        int plusGrand = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.print("Entrez un nombre entier positif (0 pour quitter) : ");
            nombre = scanner.nextInt();

            if (nombre > plusGrand) {
                plusGrand = nombre;
            }
        }

        System.out.println("\nLe plus grand nombre entré est : " + plusGrand);
    }
}
