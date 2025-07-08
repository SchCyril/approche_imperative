package src.fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonnaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre;
        int a = 0, b = 1, c;
        System.out.print("Entrez un nombre entier positif (0 pour quitter) : ");
        nombre = scanner.nextInt();
        while (nombre > 0) {

            System.out.print("La suite de Fibonacci jusqu'à " + nombre + " est : ");
            for (int i = 1; i <= nombre; i++) {
                if (i == 1) {
                    System.out.print(a + " ");
                    continue;
                }
                if (i == 2) {
                    System.out.print(b + " ");
                    continue;
                }
                c = a + b;
                a = b;
                b = c;
                System.out.print(c + " ");
            }
            System.out.println();
            a = 0; // Réinitialiser pour le prochain nombre
            b = 1; // Réinitialiser pour le prochain nombre
            System.out.println();

            System.out.print("Entrez un nombre entier positif (0 pour quitter) : ");
            nombre = scanner.nextInt();
        }
    }
}
