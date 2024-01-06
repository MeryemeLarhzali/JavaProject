package TD3.Exercice2;

public class PointNom extends Point {
    char nom;
    public PointNom(int x,int y,char nom){
        super(x,y);
        this.nom=nom;
    }
    public void setPointNom(char nom , int x , int y){
        this.nom=nom;
        this.setX(x);
        this.setY(y);
    }
    public void setNom(char nom){
        this.nom=nom;
    }
    public void affCoodNom(){
        affCoord();
        System.out.println("Nom = "+nom);
    }
}
class Main{
    public static void main(String[] args){
        //utiliser la classe Point
        Point point=new Point(3,5);
        point.affCoord();
        point.deplace(2,3);
        point.affCoord();
        // utiliser la classe PointNom
        PointNom pointA = new PointNom(1,3,'B');
        pointA.affCoodNom();
        pointA.setNom('D');
        pointA.affCoodNom();

    }
}
