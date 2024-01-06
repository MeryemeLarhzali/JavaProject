package TD1.Tableaux;
import java.util.Scanner;

public class Exercice2 {
    static public void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        System.out.print("entrer un nombre :");
        int nombre = s.nextInt();
        int tableau[] = new int[20];
        int copienbr;
        copienbr = nombre; // je laisse une copie du nombre entré par l'utilisateur pour l'affichage seulement
        int i =0;
        while(copienbr !=0){
            tableau[i]=copienbr%2;
            copienbr/=2;
            i++;
        }
        System.out.println("la représentation en binaire de "+nombre+" est :");
        for(int j=i-1;j>=0;j--){
            System.out.print(tableau[j]);
        }
    }
}