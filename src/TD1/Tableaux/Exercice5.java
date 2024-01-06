package TD1.Tableaux;

public class Exercice5 {
    public static void main(String[] args) {
        char[] tableau = {'D', 'E', 'C', 'A', 'L', 'A', 'G', 'E'};

        System.out.println("Tableau initial : ");
        afficherTableau(tableau);

        decalerAGauche(tableau);

        System.out.println("\nTableau modifié : ");
        afficherTableau(tableau);
    }

    // Méthode pour effectuer le décalage des éléments du tableau vers la gauche
    public static void decalerAGauche(char[] tableau) {
        char premier = tableau[0]; // Stocke le premier élément
        for (int i = 0; i < tableau.length - 1; i++) {
            tableau[i] = tableau[i + 1]; // Décale chaque élément vers la gauche
        }
        tableau[tableau.length - 1] = premier; // Place le premier élément à la fin
    }

    // Méthode pour afficher le tableau
    public static void afficherTableau(char[] tableau) {
        for (char c : tableau) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}