package TD1.Boucles;
import java.util.Scanner;
public class Exercice10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre;
        do {
            System.out.print("Entrez un nombre de 3 chiffres : ");

             nombre = scanner.nextInt();

        }while (nombre<100 || nombre>999);

        int copienbr = nombre;
        int sommeCubes = 0;

        while (copienbr != 0) {
            int chiffre = copienbr % 10;
            sommeCubes += chiffre * chiffre * chiffre;
            copienbr /= 10;
        }

        if (sommeCubes == nombre) {
            System.out.println("Le nombre " + nombre + " est cubique !");
        } else {
            System.out.println("Le nombre " + nombre + " n'est pas cubique.");
        }

        }
    }
// il y a une autre méthode c'est de parcourir tous les nombres de trois chiffres (de 100 à 999).
// Pour chaque nombre, il extrait les trois chiffres individuellement, calcule la somme des cubes
// de ces chiffres, et vérifie si cette somme est égale au nombre initial.
// Si c'est le cas, alors ce nombre est un nombre cubique de trois chiffres et il est affiché.