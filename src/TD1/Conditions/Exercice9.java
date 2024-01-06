package TD1.Conditions;

import java.util.Scanner;

public class Exercice9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie des deux variables
        System.out.print("Entrez la première variable : ");
        int var1 = scanner.nextInt();

        System.out.print("Entrez la deuxième variable : ");
        int var2 = scanner.nextInt();

        // Vérification et échange des valeurs si nécessaire
        if (var1 > var2) {
            int temp = var1;
            var1 = var2;
            var2 = temp;
        }

        // Affichage des variables dans l'ordre croissant
        System.out.println("Les variables dans l'ordre croissant sont : " + var1 + ", " + var2);
    }
}