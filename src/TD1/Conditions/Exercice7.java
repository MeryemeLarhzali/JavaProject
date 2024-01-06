package TD1.Conditions;
import java.util.Scanner;
public class Exercice7 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Entrez un entier de trois chiffres non nuls : ");
        int nombre = s.nextInt();
        if (nombre >= 100 && nombre <= 999 ) {
            System.out.println("Les nombres formés par les chiffres de " + nombre + " sont :");
            int num = s.nextInt();
            int num1=num/100;
            int num2=(num%100)/10;
            int num3=(num%10);
            System.out.println(num1+""+num2+""+num3);
            System.out.println(num1+""+num3+""+num2);
            System.out.println(num2+""+num1+""+num3);
            System.out.println(num2+""+num3+""+num1);
            System.out.println(num3+""+num2+""+num1);
            System.out.println(num3+""+num1+""+num2);
        } else {
            System.out.println("L'entier n'est pas de trois chiffres non nuls.");
        }
    }

    }

