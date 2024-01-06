package TD1.Boucles;
import java.util.Scanner;
public class Exercice1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Entrer un nombre : ");
        int N = s.nextInt();
        int fact =1;
        for(int i = 1 ; i <= N ; i++)
            fact*=i;
        System.out.println("le factoriel de "+N+" est "+fact);
    }
}
