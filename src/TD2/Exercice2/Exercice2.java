package TD2.Exercice2;
public class Exercice2 {
    public static void main(String[] args){
        Point a = new Point();
        a.setName('A');
        a.setAbscisse(5);
        a.setOrdonne(6);
        System.out.println(a);
        Point b = new Point('B',4,3);
        b.setName('C');
        b.setAbscisse(6);
        b.setOrdonne(6);
        System.out.println(b.getAbscisse());// cette méthode d'afficher chaque exercice on le fait si on a pas fait la méthode to string
        System.out.println(b);

    }
}

 class Point {
    private char name;
    private double abscisse;
    private double ordonne;

    public Point (){

    }

    public Point(char name, double abscisse, double ordonne) {
        this.name = name;
        this.abscisse = abscisse;
        this.ordonne = ordonne;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public double getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public double getOrdonne() {
        return ordonne;
    }

    public void setOrdonne(double ordonne) {
        this.ordonne = ordonne;
    }
    public double Norme(){
        return Math.sqrt(Math.pow(abscisse,2)+Math.pow(ordonne,2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "name=" + name +
                ", abscisse=" + abscisse +
                ", ordonne=" + ordonne +
                '}';
    }
}
