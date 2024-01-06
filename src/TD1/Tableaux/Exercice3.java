package TD1.Tableaux;
import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre d'étudiants : ");
        int nombreEtudiants = scanner.nextInt();

        // Création du tableau pour stocker les moyennes
        double[] moyennes = new double[nombreEtudiants];

        // Lecture des moyennes des étudiants
        for (int i = 0; i < nombreEtudiants; i++) {
            System.out.print("Entrez la moyenne de l'étudiant " + (i + 1) + " : ");
            moyennes[i] = scanner.nextDouble();
        }

        // Demande du seuil à comparer
        System.out.print("Entrez le seuil de moyenne : ");
        double seuil = scanner.nextDouble();

        // Compter le nombre d'étudiants ayant une moyenne supérieure ou égale au seuil
        int compteEtudiants = 0;
        for (int i = 0; i < nombreEtudiants; i++) {
            if (moyennes[i] >= seuil) {
                compteEtudiants++;
            }
        }

        System.out.println("Nombre d'étudiants ayant une moyenne supérieure ou égale au seuil : " + compteEtudiants);

        scanner.close();
    }
}