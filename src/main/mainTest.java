package main;

import Controllers.*;
import Models.*;
import services.*;
import static services.DepartementServices.departements;
import static services.EnseignantServices.enseignants;
import static services.EnseignantServices.getEnseignantById;
import static services.EnseignantServices.getIdEnseignant;

import java.util.Scanner;

public class mainTest {
    public static boolean isNull(Object ob) {
        return ob == null ;
    }
    public static void AffichePrincipalMenu(){
        System.out.println("-------------------------[ Voici le menu Principale ]---------------------------");


        System.out.println("1: Pour gérer les départements");
        System.out.println("2: Pour gérer les filières");
        System.out.println("3: Pour gérer les enseignants");
        System.out.println("4: Pour gérer les modules");
        System.out.println("5: Pour gérer les étudiants");
        System.out.println("0: Pour sortir");

        System.out.println("Veuillez sélectionner une option : ");
        Scanner s = new Scanner(System.in);
        int choix = s.nextInt();
        switch(choix) {
            case 1:
                DepartementController.AfficheMenu();
                break;
            case 2:
                FiliereController.AfficheMenu();
                break;
            case 3:
                EnseignantController.AfficheMenu();
                break;
            case 4:
                ModuleController.AfficheMenu();
                break;
            case 5:
                EtudiantController.AfficheMenu();
                break;
            default:
                System.out.println("Votre choix est incorrecte Veuillez choisir de 0 --> 5");
        }

    }
    public static void main(String[] args) {

        Enseignant enseignant = new Enseignant();
        enseignant.setNom("Meryeme");
        enseignant.setPrenom("Larhzali");
        enseignant.setEmail("meryemelarhzali@gmail.com");
        enseignant.setGrade("Proffesseur");
        enseignant.setId(getIdEnseignant());
        enseignants.add(enseignant);
        AffichePrincipalMenu();
    }
}
