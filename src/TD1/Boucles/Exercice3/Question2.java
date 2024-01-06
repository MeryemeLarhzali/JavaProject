package TD1.Boucles.Exercice3;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int position = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Entrez le nombre " + (i + 1) + " : ");
            int nombre = scanner.nextInt();

            if (nombre > max) {
                max = nombre;
                position = i + 1;
            }
        }

        System.out.println("Le maximum des 20 nombres saisis est : " + max);
        System.out.println("Il a été saisi à la position : " + position);
    }
}