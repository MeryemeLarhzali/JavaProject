package TD1.Boucles.Exercice3;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 20; i++) {
            System.out.print("Entrez le nombre " + (i + 1) + " : ");
            int nombre = scanner.nextInt();

            if (nombre > max) {
                max = nombre;
            }
        }

        System.out.println("Le maximum des 20 nombres saisis est : " + max);
    }
}
