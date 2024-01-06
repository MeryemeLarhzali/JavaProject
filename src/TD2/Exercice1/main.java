package TD2.Exercice1;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //créer un point
        Point point = new Point('A',5);
        //afficher les caractéristique du point
        point.affiche();
        //demmander a l'utilisateur de nombre de translation
        System.out.println("entrer le nombre de translation : ");
        double x=s.nextDouble();
        //déplacer le point
        double z=point.translate(x);// parceque j'ai declarer la méthode translate avec un type de retour double
        //Afficher à nouveau les caractéristiques du point après la translation
        System.out.println("la valeur après translation est : "+z);
        point.affiche();
    }
}
