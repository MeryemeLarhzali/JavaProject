package TD1.Boucles;
import java.util.Scanner;
public class Exercice9 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez un nombre entier : ");

            int nombre = scanner.nextInt();
            int somme = 0;
            int copienbr;
            copienbr=nombre;

            while (copienbr != 0) {
                int reste;
                reste=copienbr % 10;
                somme += reste ;

                copienbr /= 10;
            }

            System.out.println("La somme des chiffres du nombre "+ nombre+ "est : " + somme);
        }
    }

