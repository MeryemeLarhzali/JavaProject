package TD2.Exercice5;

public class Rectangle {
    private double longueur;
    private double largeur;

    // Constructeurs
    public Rectangle() {
    }

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle(Rectangle autreRectangle) {
        this.longueur = autreRectangle.getLongueur();
        this.largeur = autreRectangle.getLargeur();
    }

    // Accesseurs et Mutateurs avec vérification de valeurs positives
    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        if (longueur > 0) {
            this.longueur = longueur;
        } else {
            System.out.println("La longueur doit être positive");
        }
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        if (largeur > 0) {
            this.largeur = largeur;
        } else {
            System.out.println("La largeur doit être positive");
        }
    }

    // Méthodes de calcul
    public double perimetre() {
        return 2 * (longueur + largeur);
    }

    public double aire() {
        return longueur * largeur;
    }

    public boolean isCarre() {
        return longueur == largeur;
    }

    // Méthode toString()
    @Override
    public String toString() {
        return "Rectangle{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                '}';
    }
}