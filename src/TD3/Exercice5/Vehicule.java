package TD3.Exercice5;

public class Vehicule {
    //si la classe véhicule contient un constructeur vide alors en vas pas de problème dans la classe fille si on l'instacier pas le constructeur par défaut il vas prendre le constructeur par défaut
    // implémenter leur méthode!!!!!
    //exercice 6 une méthode pour afficher tous les types de figures
    //static void show(figure f){sout("perimètre : "+f.getperimètre()+" air : "+f.getair())
    // le role de classe abstract et les interfaces
    //fremwork : organise les chose "spring dans java , ravel dans BD" ca pour les back end/ jango pour python/angulaire ou react ou viewjs dans font int
    // pour les stages

        private int nbPassager;

        public Vehicule(int n) {
            nbPassager = n;
        }

    public int getNbPassager() {
        return nbPassager;
    }

    public void setNbPassager(int nbPassager) {
        this.nbPassager = nbPassager;
    }

    public String toString() {
            return "Nombre de passagers du véhicule : " + nbPassager;
        }
}
