package TD3.Exercice3;

public class Cercle extends Centre{
    private double rayon;
    public Cercle(int x,int y,char nom,double rayon){
        super(x,y,nom);
        this.rayon=rayon;
    }
    public double calculesurface(){
      // return 3.14*rayon*rayon;
        return Math.PI * Math.pow(rayon, 2);
        //on peut travailler avec les deux méthodes c'est la meme resultat mais la deusième est plus précise
    }

}
