package TD1.Boucles;

import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier positif n : ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Veuillez entrer un entier positif.");
            return;
        }

        int resultat = fibonacci(n);
        System.out.println("Le " + n + "-ème terme de la suite de Fibonacci est : " + resultat);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}