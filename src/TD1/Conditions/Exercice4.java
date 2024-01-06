package TD1.Conditions;
import java.util.Scanner;
public class Exercice4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Entrez la moyenne de l'etudiant : ");
        double moyenne = s.nextInt();

        if (moyenne>=16)
            System.out.println("T.Bien");
        else if
            (moyenne>= 14) System.out.println("Bien");
        else if
            (moyenne>= 12) System.out.println("A.Bien");
        else if
             (moyenne>=10) System.out.println("Passable");
        else
             System.out.println("Non admis ");

    }
}
