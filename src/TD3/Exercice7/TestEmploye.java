package TD3.Exercice7;

public class TestEmploye {
    public static void main(String[] args) {
        Patron patron1 = new Patron("Alaoui", "Ahmed", 5000.0);
        TravailleurCommission travailleur1 = new TravailleurCommission("nassiri", "adam", 2000.0, 0.1);
        TravailleurHoraire horaire1 = new TravailleurHoraire("Sawiri", "Amine", 15.0);

        patron1.setSalaire(6000.0);
        travailleur1.setQuantite(50);
        horaire1.setHeures(160);

        System.out.println("Informations du patron : " + patron1);//automatiquement il va appeler la méthode toString
        System.out.println("Gains du patron : " + patron1.gains());

        System.out.println("Informations du travailleur à commission : " + travailleur1);
        System.out.println("Gains du travailleur à commission : " + travailleur1.gains());

        System.out.println(" Informations du travailleur horaire : " + horaire1);
        System.out.println("Gains du travailleur horaire : " + horaire1.gains());
    }

}
