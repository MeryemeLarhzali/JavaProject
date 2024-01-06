package TD3.Exercice7;

public class TravailleurHoraire extends Employe{
    private double retribution;
    private double heures;
    public TravailleurHoraire() {
        super();
    }
    public TravailleurHoraire(String nom, String prenom, double retribution) {
        super(nom, prenom);
        this.retribution = retribution;
        this.heures = 0.0;
    }
    public double getRetribution() {
        return retribution;
    }

    public void setRetribution(double retribution) {
        this.retribution = retribution;
    }

    public double getHeures() {
        return heures;
    }

    public void setHeures(double heures) {
        this.heures = heures;
    }
    public double gains() {
        return retribution * heures;
    }

    @Override
    public String toString() {
        return "TravailleurHoraire{" +
                "retribution=" + retribution +
                ", heures=" + heures +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                "} " + super.toString();
    }
}
