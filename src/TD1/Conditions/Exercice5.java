package TD1.Conditions;

import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("veuillez saisir l'heure( en format 24h ) : ");
        int heure = s.nextInt();

        System.out.println("veuillez entrez la langue ( 'f' ou bien 'a' )");
        char langue =s.next().charAt(0);
        if (langue == 'f') {
            if (heure >= 0 && heure < 18) {
                System.out.println("Bonjour");
            } else if (heure >= 18 && heure < 22) {
                System.out.println("Bonsoir");
            } else {
                System.out.println("Bonne nuit");
            }
        }
        if(langue == 'a'){
            if (heure >= 0 && heure < 18) {
                System.out.println("Good Morning");
            } else if (heure >= 18 && heure < 22) {
                System.out.println("Good Evening");
            } else {
                System.out.println(" Good Night ");
            }
        }
    }
}
