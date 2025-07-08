package src.fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre = (int) (Math.random() * 100);

        System.out.println("Bienvenue dans le jeu Plus ou Moins !");
        System.out.println("J'ai choisi un nombre entre 0 et 99. Essayez de le deviner !");
        int essai = -1;
        int compteur = 0;
        while (essai != nombre) {
            System.out.print("Entrez votre essai : ");
            essai = scanner.nextInt();
            compteur++;
            if (essai < nombre) {
                System.out.println("C'est plus !");
            } else if (essai > nombre) {
                System.out.println("C'est moins !");
            } else {
                System.out.println("Bravo ! Vous avez trouvé le nombre " + nombre + " en " + compteur + " coups.");
            }
        }

    }
}
