package TD1.Conditions;
import java.util.Scanner;

public class Exercice8 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Saisie du numéro du mois
            System.out.print("Entrez le numéro du mois (1-12) : ");
            int mois = scanner.nextInt();

            // Vérification de la validité du mois
            if (mois < 1 || mois > 12) {
                System.out.println("Numéro de mois invalide !");
                return;
            }

            // Saisie de l'année
            System.out.print("Entrez l'année (1900-2100) : ");
            int annee = scanner.nextInt();

            // Vérification de la validité de l'année
            if (annee < 1900 || annee > 2100) {
                System.out.println("Année invalide !");
                return;
            }

            int nombreJours = 0;

            // Calcul du nombre de jours pour le mois saisi
            switch (mois) {
                case 1, 3, 5, 7, 8, 10, 12:
                    nombreJours = 31;
                    break;
                case 4, 6, 9, 11:
                    nombreJours = 30;
                    break;
                case 2:
                    if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
                        nombreJours = 29;
                    } else {
                        nombreJours = 28;
                    }
                    break;
            }

            // Affichage du nombre de jours pour le mois et l'année saisis
            System.out.println("Le nombre de jours pour le mois " + mois + " de l'année " + annee + " est : " + nombreJours);
        }
}
