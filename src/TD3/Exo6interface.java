package TD3;

interface Exo6interface {
}
interface Figuure {
    double getPerimeter();
    double getArea();
    String toString();
}

// Interface représentant une figure nommée
interface NamedFigure extends Figuure {
    void setName(String name);
    String getName();
}

// Implémentation de l'interface Figure pour un disque
class Circle implements NamedFigure {
    private String name;
    private double center;
    private double radius;

    public Circle() {
        this.name = "";
        this.center = 0.0;
        this.radius = 0.0;
    }

    public Circle(double center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle(double center, double radius, String name) {
        this(center, radius);
        this.name = name;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Circle: Name=" + name + ", Center=" + center + ", Radius=" + radius;
    }
}

// Implémentation de l'interface Figure pour un rectangle
class Reectangle implements NamedFigure {
    private String name;
    private double length;
    private double width;

    public Reectangle() {
        this.name = "";
        this.length = 0.0;
        this.width = 0.0;
    }

    public Reectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Reectangle(double length, double width, String name) {
        this(length, width);
        this.name = name;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Rectangle: Name=" + name + ", Length=" + length + ", Width=" + width;
    }
}

// Classe de test pour tester les figures
 class TestFigure {
    public static void main(String[] args) {
        NamedFigure circle = new Circle(0, 5, "My Circle");
        NamedFigure rectangle = new Reectangle(4, 3, "My Rectangle");

        System.out.println(circle);
        System.out.println("Perimeter of the circle: " + circle.getPerimeter());
        System.out.println("Area of the circle: " + circle.getArea());

        System.out.println("\n" + rectangle);
        System.out.println("Perimeter of the rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the rectangle: " + rectangle.getArea());
    }
}
