package TD3;
import TD2.Exercice1.Point;

public class Exercice6 {
        public static void main(String[] args) {
            Disque disque1 = new Disque(new Point((char) 3, 4.0), 5, "Disque 1");
            System.out.println(disque1);
            System.out.println("Perimeter: " + disque1.getPerimeter());
            System.out.println("Area: " + disque1.getAire());

            Rectangle rectangle1 = new Rectangle(5, 7, "Rectangle 1");
            System.out.println(rectangle1);
            System.out.println("Perimeter: " + rectangle1.getPerimeter());
            System.out.println("Area: " + rectangle1.getAire());
        }
    }
abstract class Figure{
    protected String nom;

    public abstract double getPerimeter();

    public abstract double getAire();

    @Override
    public String toString() {
        return "Nom de la figure : " + nom;
    }
}
class Disque extends Figure {
    private Point centre;
    private double rayon;

    public Disque() {

    }

    public Disque(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    public Disque(Point centre, double rayon, String nom) {
        this.centre = centre;
        this.rayon = rayon;
        this.nom = nom;
    }


    public double getPerimeter() {
        return 2 * Math.PI * rayon;
    }

    public double getAire() {
        return Math.PI * rayon * rayon;
    }
}
class Rectangle extends Figure {
    private double longueur;
    private double largeur;

    public Rectangle() {

    }

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle(double longueur, double largeur, String nom) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.nom = nom;
    }

    // Accesseurs et mutateurs pour longueur et largeur

    public double getPerimeter() {
        return 2 * (longueur + largeur);
    }

    public double getAire() {
        return longueur * largeur;
    }
}