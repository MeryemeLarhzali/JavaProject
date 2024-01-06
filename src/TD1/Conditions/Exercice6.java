package TD1.Conditions;
import java.util.Scanner;
public class Exercice6 {
    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
        int a;
        System.out.println("veuillez saisir le premier nombre  ");
        a = s.nextInt();
        int b;
        System.out.println("veuillez saisir le deuxième nombre  ");
        b=s.nextInt();
        if(a>0 && b>0){
            System.out.println("le produit est de signe positive ");
        }
        else if (a==0 || b==0) {
            System.out.println("le produit est nulle ");
        }
        else
            System.out.println("le produit est negative ");
    }
}
