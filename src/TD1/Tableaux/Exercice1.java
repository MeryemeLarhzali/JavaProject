package TD1.Tableaux;

import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau (entre 10 et 50) : ");

        int taille = scanner.nextInt();

        // Vérification de la taille du tableau
        if (taille < 10 || taille > 50) {
            System.out.println("La taille du tableau doit être comprise entre 10 et 50.");
            return;
        }

        int[] tableau = new int[taille];

        // Remplissage du tableau
        for (int i = 0; i < taille; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }

        // Recherche de la valeur maximale et minimale
        int valeurMaximale = tableau[0];
        int valeurMinimale = tableau[0];

        for (int i = 1; i < taille; i++) {
            if (tableau[i] > valeurMaximale) {
                valeurMaximale = tableau[i];
            }
            if (tableau[i] < valeurMinimale) {
                valeurMinimale = tableau[i];
            }
        }

        // Affichage des résultats
        System.out.println("La valeur maximale dans le tableau est : " + valeurMaximale);
        System.out.println("La valeur minimale dans le tableau est : " + valeurMinimale);

    }
}