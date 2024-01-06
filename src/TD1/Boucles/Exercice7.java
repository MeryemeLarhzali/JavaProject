package TD1.Boucles;

import java.util.Scanner;

public class Exercice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre de lignes pour le triangle : ");
        int nombreLignes = scanner.nextInt();

        // Boucle pour gérer les lignes
        for (int i = 1; i <= nombreLignes; i++) {
            // Boucle pour imprimer les nombres
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Passer à la ligne suivante après chaque série de nombres
        }
    }
}