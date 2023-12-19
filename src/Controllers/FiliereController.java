package Controllers;
import Models.*;
import services.*;
import java.util.Scanner;
import java.util.ArrayList;

import static services.DepartementServices.departements;
import static services.FiliereServices.filieres;
public class FiliereController {
    public static void AfficheMenu(){
        System.out.println("=======================[ filières ]==============================");


        System.out.println("1: Pour ajouter un filiere");
       // System.out.println("2: Pour afficher les filieres");
        System.out.println("3: Pour modifier un filiere");
        System.out.println("4: Pour supprimer un filiere");
        System.out.println("0: Pour retourner au menu principal");

        Scanner s = new Scanner(System.in);
        System.out.println("Entrez une option : ");
        int option = s.nextInt();
        switch(option) {
            case 1:
                creerFiliere();
                break;
            case 2:
                AfficherFilieres();
                break;
            case 3:
                ModifieFiliere();
                break;
            case 4:
                SupprimerFiliere();
                break;
            default:
                main.mainTest.AffichePrincipalMenu();
        }
    }
    public static void AfficherFilieres(){
        for (Filiere filiere : filieres ) {
            System.out.print("Id : " + filiere.getId());
            System.out.print(" | Intitulé : " + filiere.getIntitule());
            if (! main.mainTest.isNull(filiere.getChef())) {
                System.out.print(" | Chef : " + filiere.getChef().getNom() + " " + filiere.getChef().getPrenom());
            }
            if (! main.mainTest.isNull(filiere.getDept())) {
                System.out.print(" | Departement : " + filiere.getDept().getIntitule());
            }
            System.out.println("");
        }

    }
    public static void creerFiliere(){
        Scanner s = new Scanner(System.in);
        System.out.println("Entrez l'intitulé : ");
        String intitule = s.nextLine();
        EnseignantController.AfficherEnseignants();
        System.out.println("Veuillez séléctionner un enseignant par id");
        int id = s.nextInt();
        DepartementController.AfficherDepartements();
        System.out.println("Veuillez séléctionner un Département par id");
        int id2 = s.nextInt();
        FiliereServices.AjoutFiliere(intitule,EnseignantServices.getEnseignantById(id),DepartementServices.getDeptById(id2));
        AfficherFilieres();
        AfficheMenu();
    }
    public static void ModifieFiliere(){
        AfficherFilieres();
        Scanner s = new Scanner(System.in);
        // on affiche les filieres pour que l'utilisateur modifie une filiere deja existe
        System.out.println("sélectionner un id ");
        int id = s.nextInt();
        System.out.println("Veuillez saisie l'intitulé");
        Scanner s1 = new Scanner(System.in);
        String intitule = s1.nextLine();
        EnseignantController.AfficherEnseignants();
        System.out.println("Sélectionné un enseignant par id");
        int NouvId = s.nextInt();
        DepartementController.AfficherDepartements();
        System.out.println("Sélectionné un departement par id");
        int NouvId2 = s.nextInt();
        FiliereServices.modifierFiliere(id,intitule,EnseignantServices.getEnseignantById(NouvId),DepartementServices.getDeptById(NouvId2));
        AfficherFilieres();
        AfficheMenu();
    }
    public static void SupprimerFiliere(){
        Scanner s = new Scanner(System.in);
        AfficherFilieres();
        System.out.println("sélectionner un id ");
        int id = s.nextInt();
        FiliereServices.supprimerFiliereById(id);
        AfficherFilieres();
    }
}
