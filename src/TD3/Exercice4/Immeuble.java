package TD3.Exercice4;

public class Immeuble extends Batiment{
     private int nbAppart;//• nbAppart: Le nombre d'appartements de l'immeuble.
     public Immeuble(){}
     public Immeuble(String adresse,int nbAppart){
         super(adresse);
         this.nbAppart=nbAppart;
     }

    public int getNbAppart() {
        return nbAppart;
    }

    public void setNbAppart(int nbAppart) {
        this.nbAppart = nbAppart;
    }

    @Override
    public String toString() {
        return "Immeuble{" +
                "nbAppart=" + nbAppart +
                "} " + super.toString();
    }
}
