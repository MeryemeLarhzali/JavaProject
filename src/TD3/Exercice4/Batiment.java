package TD3.Exercice4;

public class Batiment {
    private String adresse;
    public Batiment(){}
    public Batiment(String adresse){
        this.adresse=adresse;
    }
    // Accesseurs et mutateurs pour l'attribut adresse

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Batiment{" +
                "adresse='" + adresse + '\'' +
                '}';
    }
}
class testBatiment{
    public static void main(String[] args){
        //teste de la classe batiment
        Batiment batiment=new Batiment("123 ainsebaa casablanca");
        //System.out.println(batiment); c'est pareil avec la méthode toString
        System.out.println(batiment.toString());

        //teste de la classe Maison
        Maison maison=new Maison("123 ainsebaa casablanca",215);
        System.out.println(maison);

        //teste de la classe Immeuble
        Immeuble immeuble = new Immeuble("123 ainsebaa casablanca",13);
        System.out.println(immeuble);
    }
}
