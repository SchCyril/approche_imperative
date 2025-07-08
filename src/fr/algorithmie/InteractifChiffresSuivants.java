package src.fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre;
        System.out.print("Entrez un nombre entier : ");
        nombre = scanner.nextInt();
        System.out.println("Les 10 nombres suivants sont :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(nombre + i);
        }
        System.out.println("\nFin du programme.");
    }
}
