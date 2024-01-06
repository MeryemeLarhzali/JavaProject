package TD3.Exercice7;

public class TravailleurCommission extends Employe{
    private double salaire;
    private double commission;
    private int quantite;

    public TravailleurCommission() {
        super();
        //this.salaire = 0.0;
        //this.commission = 0.0;
        //this.quantite = 0;
    }

    public TravailleurCommission(String nom, String prenom, double salaire, double commission) {
        super(nom, prenom);
        this.salaire = salaire;
        this.commission = commission;
        this.quantite = 0;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public double gains() {
        return salaire + (commission * quantite);
    }

    @Override
    public String toString() {
        return super.toString() + ", Salaire : " + salaire + ", Commission : " + commission + ", Quantité : " + quantite;
    }
}
