package src.fr.algorithmie;

import java.util.Scanner;

public class Interactif21Batons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbBatons = 21;
        int nbRetire = 0;
        int joueur;


        System.out.println("Bienvenue au jeu des 21 batons !");
        System.out.println("Le but du jeu est de ne pas retirer le dernier baton.");
        System.out.println("A chaque tour, vous pouvez retirer 1, 2 ou 3 batons.");
        System.out.println("Le joueur qui retire le dernier baton perd la partie.");
        System.out.println("Le jeu commence avec " + nbBatons + " batons.");
        System.out.println("Tirage au sort pour déterminer qui commence : \n");


        joueur = (Math.random() < 0.5) ? 1 : 2;

        if (joueur == 1) {
            System.out.println("Le joueur commence.");
        } else {
            System.out.println("L'ordinateur commence.");
        }
        while (nbBatons > 0) {
            System.out.println("Il reste " + nbBatons + " batons.");
            if (joueur == 1) {
                System.out.print((joueur == 1 ? "Vous" : "L'ordinateur") + ", combien de batons voulez-vous retirer (1, 2 ou 3) ? ");
                nbRetire = scanner.nextInt();
                while (nbRetire < 1 || nbRetire > 3) {
                    System.out.print("Entrée invalide. Veuillez entrer 1, 2 ou 3 : ");
                    nbRetire = scanner.nextInt();
                }
            } else {
                // L'ordinateur joue
                nbRetire = (int) (Math.random() * 3) + 1; // Retire entre 1 et 3 batons
                System.out.println("L'ordinateur retire " + nbRetire + " batons.");
            }

            nbBatons -= nbRetire;
            joueur = (joueur == 1) ? 2 : 1; // Changer de joueur


            if (nbBatons <= 0) {
                if (joueur == 1) {
                    System.out.println("L'ordinateur a retiré le dernier baton. vous avez gagné !");
                } else {
                    System.out.println("Le joueur a retiré le dernier baton. L'ordinateur a gagné !");
                }
                break;
            }


        }

    }
}
