package src.fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tableau = new int[0];

        while (true) {
            System.out.println(menu());
            System.out.print("Choix : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1 -> {
                    System.out.print("Entrez un nombre à ajouter : ");
                    int nombre = scanner.nextInt();
                    tableau = ajouterNombre(tableau, nombre);
                    System.out.println("Nombre ajouté !");
                }
                case 2 -> {
                    if (tableau.length == 0) {
                        System.out.println("Le tableau est vide.");
                    } else {
                        System.out.println("Contenu du tableau :");
                        for (int i = 0; i < tableau.length; i++) {
                            System.out.println("- " + tableau[i]);
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Fin du programme.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Choix invalide !");
            }
        }
    }

    // Fonction pour ajouter un nombre dans un tableau (en agrandissant)
    public static int[] ajouterNombre(int[] tableau, int valeur) {
        int[] nouveauTableau = new int[tableau.length + 1];
        for (int i = 0; i < tableau.length; i++) {
            nouveauTableau[i] = tableau[i];
        }
        nouveauTableau[tableau.length] = valeur;
        return nouveauTableau;
    }

    // Menu principal
    public static String menu() {
        return "\n--- MENU ---\n" +
                "1) Ajouter un nombre\n" +
                "2) Afficher les nombres\n" +
                "3) Quitter\n";
    }
}
