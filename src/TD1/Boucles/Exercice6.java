package TD1.Boucles;

public class Exercice6 {
    public static void main(String[] args) {
        int total = 15;

        System.out.println("Les différentes combinaisons pour obtenir un total de " + total + " avec trois entiers entre 1 et 9 sont :");

        // Trois boucles imbriquées pour générer toutes les combinaisons possibles
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    if (i + j + k == total) {
                        System.out.println(i + " + " + j + " + " + k + " = " + total);
                    }
                }
            }
        }
    }
}
