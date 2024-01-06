package TD1.Boucles;

import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie des deux entiers a et b
        System.out.print("Entrez le premier entier a : ");
        int a = scanner.nextInt();

        System.out.print("Entrez le deuxième entier b : ");
        int b = scanner.nextInt();

        // Vérification que a et b sont des entiers positifs non nuls
        if (a <= 0 || b <= 0) {
            System.out.println("Les nombres doivent être positifs et non nuls !");
            return;
        }

        // Calcul du PGCD en utilisant l'algorithme d'Euclide
        int pgcd = calculerPGCD(a, b);

        // Affichage du PGCD
        System.out.println("Le PGCD de " + a + " et " + b + " est : " + pgcd);
    }

    // Méthode récursive pour calculer le PGCD
    public static int calculerPGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculerPGCD(b, a % b);
        }
    }
}