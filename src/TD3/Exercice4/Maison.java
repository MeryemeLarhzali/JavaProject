package TD3.Exercice4;

public class Maison extends Batiment{
    private int nbChambre;// Le nombre de pièces de la maison.
    public Maison(int nbChambre){
        super();
        this.nbChambre = nbChambre;
    }
    public Maison(String adresse,int nbChambre){
        super(adresse);
        this.nbChambre=nbChambre;
    }

    public int getNbChambre() {
        return nbChambre;
    }

    public void setNbChambre(int nbChambre) {
        this.nbChambre = nbChambre;
    }

    @Override
    public String toString() {
        return "Maison{" +
                "nbChambre=" + nbChambre +
                "} " + super.toString();
    }
}
