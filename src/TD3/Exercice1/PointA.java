package TD3.Exercice1;

 class PointA extends Point{
    public PointA(int x,int y){
        //le super fait appel au constructeur de la super classe ou bien la classe mère qui est la classe Point
        super(x,y);
    }
    public void affiche(){
        System.out.println("Coordonnées du point : (" + getX() + ", " + getY() + ")");
    }
}
 class Main {
    public static void main(String[] args){
        // Utilisation de la classe Point
        Point point1 = new Point(3, 4);
        point1.deplace(1, 2);
        System.out.println("Coordonnées du point1 : (" + point1.getX() + ", " + point1.getY() + ")");

        // Utilisation de la classe dérivée PointA
        PointA point2 = new PointA(1, 1);
        point2.deplace(2, 3);
        point2.affiche();
    }
 }
 /*
 Que se passerait-il si la classe Point ne disposait pas des méthodes getX et getY ?
 si on supprime les getters de la classe point on ne peut pas accéder directement
 aux coordonner x,y de l'objectif parceque les attributs sont déclaré private
 (on aura une erreur de compilation)
  */