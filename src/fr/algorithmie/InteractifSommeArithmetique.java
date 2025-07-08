package src.fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre;
        int somme;

        System.out.print("Entrez un nombre entier positif (0 pour quitter) : ");
        nombre = scanner.nextInt();

        while (nombre > 0) {
            somme = 0; // Réinitialiser la somme pour chaque nouveau nombre
            for (int i = 1; i <= nombre; i++) {
                somme += i;
            }
            System.out.println(somme);
            System.out.print("Entrez un nombre entier positif (0 pour quitter) : ");
            nombre = scanner.nextInt();
        }
    }
}
