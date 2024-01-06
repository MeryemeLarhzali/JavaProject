package TD1.Tableaux;
import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisie de la première matrice :");
        double[][] matrice1 = saisirMatrice(scanner);

        System.out.println("Saisie de la deuxième matrice :");
        double[][] matrice2 = saisirMatrice(scanner);

        if (matrice1.length != matrice2.length || matrice1[0].length != matrice2[0].length) {
            System.out.println("Les matrices ne sont pas de la même taille. Impossible de les additionner.");
        } else {
            double[][] sommeMatrices = additionnerMatrices(matrice1, matrice2);
            afficherMatrice(sommeMatrices);
        }

        scanner.close();
    }

    // Méthode pour saisir une matrice
    public static double[][] saisirMatrice(Scanner scanner) {
        System.out.print("Entrez la taille de la matrice carrée : ");
        int taille = scanner.nextInt();

        double[][] matrice = new double[taille][taille];

        System.out.println("Saisie des éléments de la matrice :");
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.print("Matrice[" + i + "][" + j + "] : ");
                matrice[i][j] = scanner.nextDouble();
            }
        }
        return matrice;
    }

    // Méthode pour additionner deux matrices carrées
    public static double[][] additionnerMatrices(double[][] matrice1, double[][] matrice2) {
        int taille = matrice1.length;
        double[][] resultat = new double[taille][taille];

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                resultat[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }
        return resultat;
    }

    // Méthode pour afficher une matrice
    public static void afficherMatrice(double[][] matrice) {
        System.out.println("La somme des matrices est :");
        for (double[] ligne : matrice) {
            for (double valeur : ligne) {
                System.out.print(valeur + "\t");
            }
            System.out.println();
        }
    }
}