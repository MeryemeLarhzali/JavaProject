package TD1.Boucles;

import java.util.Scanner;

public class Exercice8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre d'étoiles pour le motif : ");
        int nombreEtoiles = scanner.nextInt();

        // Partie croissante
        for (int i = 1; i <= nombreEtoiles; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Partie décroissante
        for (int i = nombreEtoiles - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}