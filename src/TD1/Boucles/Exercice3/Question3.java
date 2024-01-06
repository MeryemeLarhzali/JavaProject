package TD1.Boucles.Exercice3;
import java.util.Scanner;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int nombre;

        do {
            System.out.print("Entrez un nombre (0 pour arrêter) : ");
            nombre = scanner.nextInt();

            if (nombre > max) {
                max = nombre;
            }
        } while (nombre != 0);

        System.out.println("Le maximum de la suite de nombres saisis est : " + max);
    }
}