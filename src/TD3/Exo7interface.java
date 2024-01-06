package TD3;

 interface Exo7interface {
}
interface Employe {
    String getNom();
    String getPrenom();
    double gains();
}

// Implémentation de l'interface Employe pour un patron
class Patron implements Employe {
    private String nom;
    private String prenom;
    private double salaire;

    public Patron(String nom, String prenom, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }

    @Override
    public double gains() {
        return salaire;
    }
}

// Implémentation de l'interface Employe pour un travailleur à commission
class TravailleurCommission implements Employe {
    private String nom;
    private String prenom;
    private double salaire;
    private double commission;
    private int quantite;

    public TravailleurCommission(String nom, String prenom, double salaire, double commission) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
        this.commission = commission;
        this.quantite = 0;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public double gains() {
        return salaire + (commission * quantite);
    }
}

// Implémentation de l'interface Employe pour un travailleur horaire
class TravailleurHoraire implements Employe {
    private String nom;
    private String prenom;
    private double retribution;
    private double heures;

    public TravailleurHoraire(String nom, String prenom, double retribution) {
        this.nom = nom;
        this.prenom = prenom;
        this.retribution = retribution;
        this.heures = 0.0;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }

    public void setHeures(double heures) {
        this.heures = heures;
    }

    @Override
    public double gains() {
        return retribution * heures;
    }


    // Classe de test pour tester les différents employés
    public static void main(String[] args) {
        Employe patron = new Patron("Dupont", "Jean", 5000.0);
        Employe travailleurCommission = new TravailleurCommission("Martin", "Sophie", 2000.0, 0.1);
        Employe travailleurHoraire = new TravailleurHoraire("Lefevre", "Pierre", 15.0);

        // Effectuer des actions spécifiques à chaque type d'employé (ajouter des quantités, des heures, etc.)

        // Afficher les informations et les gains de chaque employé
    }
}

