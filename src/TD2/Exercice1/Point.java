package TD2.Exercice1;

public class Point {
    private char name;
    private double abscisse;
    public Point(char name,double abscisse){
        this.name=name;
        this.abscisse=abscisse;
    }
    public void affiche(){
        System.out.println("Point "+name+"  Abscisse = "+abscisse);
    }
    public double translate(double translationvalue){
        return abscisse+=translationvalue;
    }
}

