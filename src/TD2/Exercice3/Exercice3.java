package TD2.Exercice3;
public class Exercice3 {
    public static void main (String[] args){
        Livre livre = new Livre();
        livre.setTitre("La boite a merveille");
        livre.setAuteur("Ahmed sefrioui");
        livre.setPrix(50);
        livre.setAnnee(1954);
        System.out.println(livre);
        System.out.println(livre.toString());// il donne meme chose que l'autre livre sans tiString
    }
}
class Livre{
    private String titre;
    private String auteur;
    private double prix;
    private int annee;
    public Livre(){

    }
    public Livre(String titre){
        this.titre =titre;
    }
    public Livre(String titre,String auteur){
        this.titre = titre;
        this.auteur=auteur;
    }
    public Livre(String titre,String auteur,double prix){
        this.titre = titre;
        this.auteur=auteur;
        this.prix = prix;
    }
    public Livre(String titre,String auteur,double prix,int annee){
        this.titre=titre;
        this.auteur=auteur;
        this.prix=prix;
        this.annee=annee;
    }
    public void setTitre(String titre){
        this.titre=titre;
    }
    public String getTitre(){
        return titre;
    }
    public void setAuteur(String auteur){
        this.auteur=auteur;
    }
    public String getAuteur(){
        return auteur;
    }
    public void setPrix(double prix){
        this.prix=prix;
    }
    public double getPrix(){
        return prix;
    }
    public void setAnnee(int annee){
        this.annee=annee;
    }
    public int getAnnee(){
        return annee;
    }
    public String toString(){
        return "Livre{ "+"Titre = "+titre+" Auteur= "+auteur+" Prix = "+prix+" Annee = "+annee+"}";
    }

}
