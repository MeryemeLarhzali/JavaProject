package TD2.Exercice5;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 5);
        Rectangle rectangle2 = new Rectangle(8, 6);
        Rectangle rectangle3 = new Rectangle(rectangle1);

        afficherInfoRectangle(rectangle1);
        afficherInfoRectangle(rectangle2);
        afficherInfoRectangle(rectangle3);
    }

    public static void afficherInfoRectangle(Rectangle rectangle) {
        System.out.println("Rectangle : " + rectangle);
        System.out.println("Périmètre : " + rectangle.perimetre());
        System.out.println("Aire : " + rectangle.aire());
        System.out.println("Est un carré : " + rectangle.isCarre());
        System.out.println();
    }
}