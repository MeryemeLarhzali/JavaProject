package TD2;

public class Exercice6 {
    public static void main(String[] args){
    Banque compte = new Banque(1,5000.75f,"AB 1200");
        System.out.println(compte);
        System.out.println(compte.avoirSolde());
        compte.deposer(500);
        System.out.println(compte);
        System.out.println(compte.avoirSolde());
        compte.retirer(200);
        System.out.println(compte);
        System.out.println(compte.avoirSolde());
    }
}
class Banque{
    private int NCompte;
    private float Solde;
    private String CIN ;
    public Banque(int NCompte,float Solde,String CIN){
        this.NCompte=NCompte;
        this.Solde=Solde;
        this.CIN=CIN;
    }
    public void deposer(float Somme){
        this.Solde+=Somme;
    }
    public void retirer(float Somme){
        this.Solde-=Somme;
    }
    public float avoirSolde(){
        return Solde;
    }
    public String toString(){
        return "Banque{ "+"NCompte = "+NCompte+" Solde = "+Solde+" CIN = "+CIN+" }";
    }
}
