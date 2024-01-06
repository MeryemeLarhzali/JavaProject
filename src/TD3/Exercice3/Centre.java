package TD3.Exercice3;

public class Centre extends Point{
    private char nom;
    public Centre(int x,int y,char nom){
        super(x,y);
        //le super fait appel au constructeur de la super classe ou bien la classe mère qui est la classe Point
        // on peut utiliser le super.quelque chose  pour accéder à des méthodes ou bien attributs non privée de la classe mère
        this.nom=nom;
    }
    public void affnom(){
        System.out.println("Nom= "+nom);
    }
    public void affiche(){
        super.affiche();
        // pour savoir que la méthode qu'on soyhaite appeler est celle de la clase parent
        //car la méthode affiche dans cette classe(Centre) est la redéfinition de la méthode affiche de la classe Point
        affnom();
    }
}

class main{
    public static void main(String[] args){
        Centre centre=new Centre(1,4,'B');
        centre.affnom();
        centre.affCoord();
        centre.affiche();
        Cercle cercle=new Cercle(2,5,'A',3);
        cercle.affiche();
        // il vas afficher seulement x,y,nom parcequ'on travail avec la méthode affiche de la classe Centre
        System.out.println("Surface = "+cercle.calculesurface());
    }
}
