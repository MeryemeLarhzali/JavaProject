package TD2.Exercice4;
public class Exercice4 {
    public static void main (String[] args){
        Temps temps = new Temps(10, 30, 45);
        System.out.println("Temps initial : " + temps);

        temps.ajouterHeures(5);
        System.out.println("Ajout de 5 heures : " + temps);

        temps.ajouterMinutes(70);
        System.out.println("Ajout de 70 minutes : " + temps);

        temps.ajouterSecondes(200);
        System.out.println("Ajout de 200 secondes : " + temps);

    }
}
class Temps{
    private int heures;
    private int minutes;
    private int secondes;
    public Temps(){}
    public Temps(int heures){
        this.heures=heures;
    }
    public Temps(int heures,int minutes){
        this.heures=heures;
        this.minutes=minutes;
    }
    public Temps(int heures,int minutes,int secondes){
        this.heures=heures;
        this.minutes=minutes;
        this.secondes=secondes;
    }
    public Temps(Temps nouveauTemps){
        this.heures=nouveauTemps.getHeures();
        this.minutes=nouveauTemps.getMinutes();
        this.secondes=nouveauTemps.getSecondes();
    }
    public void setHeures(int heures){
        this.heures=heures;
    }
    public int getHeures(){
        return heures;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSecondes() {
        return secondes;
    }

    public void setSecondes(int secondes) {
        this.secondes = secondes;
    }
    public void ajouterHeures(int heures){
        this.heures=(this.heures+heures)%24;
    }
    public void ajouterMinutes(int minutes){
        int totalMinutes = this.heures * 60 + this.minutes + minutes;
        this.heures = (totalMinutes / 60) % 24;
        this.minutes = totalMinutes % 60;
    }
    public void ajouterSecondes(int secondes){
        int totalSecondes = this.heures * 3600 + this.minutes * 60 + this.secondes + secondes;
        this.heures = (totalSecondes / 3600) % 24;
        this.minutes = (totalSecondes / 60) % 60;
        this.secondes = totalSecondes % 60;
    }
    public String toString(){
        return "Temps {"+"Heures = "+heures+"  Minutes = "+minutes+"  Secondes = "+secondes+"}";
    }
}
