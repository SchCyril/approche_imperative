package src.fr.algorithmie;

public class NombreParfait {
    public static void main(String[] args) {
        int nombre = 8; // Exemple de nombre parfait
        int sommeDiviseurs = 0;

        // Calcul des diviseurs
        for (int i = 1; i < nombre; i++) {
            if (nombre % i == 0) {
                sommeDiviseurs += i;
            }
        }

        // Vérification si le nombre est parfait
        System.out.println(sommeDiviseurs == nombre ? nombre + " est un nombre parfait." : nombre + " n'est pas un nombre parfait.");
    }
}
