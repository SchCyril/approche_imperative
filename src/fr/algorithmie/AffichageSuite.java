package src.fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {

        // Utiliser une boucle for pour afficher tous les nombres de 1 à 10 inclus
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tous les chiffres + 10 : " + i);
        }
        //Utiliser une boucle for pour afficher tous les nombres pairs entre 0 et 10 inclus
        for (int i = 0; i <= 10; i++) {
            int reste = i % 2;
            if (reste == 0) {
                System.out.println("Chiffres pairs : " + i);
            }
        }
        // Utiliser une boucle for pour afficher tous les nombres impairs entre 0 et 9 inclus
        for (int i = 0; i <= 10; i++) {
            int reste = i % 2;
            if (reste != 0) {
                System.out.println("Chiffres impairs : " + i);
            }
        }

        // Utiliser une boucle while pour afficher tous les nombres de 1 à 10 inclus
        int i = 0;
        while (i <= 10) {
            System.out.println("Tous les chiffres + 10 dans while : " + i);
            i++;
        }

        // Utiliser une boucle while pour afficher tous les nombres pairs entre 0 et 10 inclus
        int j = 0;
        while (j <= 10) {
            System.out.println("Tous les chiffres pairs + 10 dans while : " + j);
            j = j + 2;
        }

        // Utiliser une boucle while pour afficher tous les nombres impairs entre 0 et 9 inclus
        int k = 1;
        while(k < 10) {
            System.out.println("Tous les chiffres impairs dans while : " + k);
            k = k + 2;
        }

    }
}