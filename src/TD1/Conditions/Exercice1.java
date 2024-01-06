package TD1.Conditions;
import java.util.Scanner;
public class Exercice1 {
    public static void main(String[] args){
      Scanner s = new Scanner(System.in);
        System.out.println("entrer 3 nombres : ");
      int a = s.nextInt();
      int b = s.nextInt();
      int c = s.nextInt();
      // déclarer une variable max pour contenir la valeur de max
      int max;
      if(a>b && b>c){
          max = a; }
      else if (b>a && b>c) {
          max=b;
      }
      else
          max=c;
      System.out.println("max = "+max);
      /* on peut faire une méthode qui est très simple c'est d'utuliser math.max
         premièrement on fait max=Math.max(a,b)    après    max=Math.max(max,c)*/
    }
}
