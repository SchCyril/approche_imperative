package src.fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre;

        do {
            System.out.print("Entrez un nombre entier positif entre 1 et 10 (0 pour quitter) : ");
            nombre = scanner.nextInt();

            if (nombre > 0 && nombre <= 10) {
                System.out.println("Table de multiplication de " + nombre + " :");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(nombre + " * " + i + " = " + (nombre * i));
                }
                System.out.println("-----------------------------");
            } else if (nombre < 0 || nombre > 10) {
                System.out.println("Veuillez entrer un nombre entre 1 et 10.");
            }

        } while (nombre != 0);

        System.out.println("Fin du programme.");
    }

}
