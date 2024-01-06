package TD1.Boucles;
import java.util.Scanner;
public class Exercice2 {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre : ");
        int N = s.nextInt();
        int S=0;
        for(int i=0 ; i <= N ; i++){
            // on fait un teste pour les nombres pair et impair
            if((i%2)!=0)
                S+=i;
        }
        System.out.println("La somme est  "+S);
    }
}
