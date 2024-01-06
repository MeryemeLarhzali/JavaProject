package Controllers;

import Models.*;
import services.DepartementServices;
import services.EnseignantServices;
import java.util.Scanner;
import static services.DepartementServices.departements;
import static main.mainTest.AffichePrincipalMenu;
import java.util.List;

public class DepartementController {
    public static void AfficheMenu(){
        System.out.println("=======================[ Départements ]==============================");


        System.out.println("1: Pour ajouter un département");
        System.out.println("2: Pour afficher les départements");
        System.out.println("3: Pour modifier un département");
        System.out.println("4: Pour supprimer un département");
        System.out.println("0: Pour retourner au menu principal");

        Scanner s = new Scanner(System.in);
        System.out.println("Entrez une option : ");
        int option = s.nextInt();
        switch(option) {
            case 1:
                creerDepartement();
                break;
            case 2:
                AfficherDepartements();
                break;
            case 3:
                ModifieDepartement();
                break;
            case 4:
                SupprimerDepartement();
                break;
            default:
                main.mainTest.AffichePrincipalMenu();
        }
    }
    public static void AfficherDepartements(){
        List<Departement> departements = DepartementServices.getAllDepartements();
        for (Departement departement : departements) {
            System.out.print("Id : " + departement.getId());
            System.out.print(" | Intitulé : " + departement.getIntitule());
            if (departement.getChef() != null) {
                System.out.print(" | Chef : " + departement.getChef().getNom() + " " + departement.getChef().getPrenom());
            }
            System.out.println("");
        }
    }
    public static void creerDepartement(){
        Scanner s = new Scanner(System.in);
        System.out.println("Entrez l'intitulé : ");
        String intitule = s.nextLine();
        EnseignantController.AfficherEnseignants();
        System.out.print("Veuillez séléctionner un enseignant par id : ");
        int id = s.nextInt();
        DepartementServices.ajoutDepartement(intitule,EnseignantServices.getEnseignantById(id));
        AfficherDepartements();
        AfficheMenu();
    }
    public static void ModifieDepartement(){
        AfficherDepartements();// on affiche les département pour que l'utilisateur modifie un depart deja existe
        Scanner s = new Scanner(System.in);
        System.out.println("sélectionner un id ");
        int id = s.nextInt();
        System.out.println("Veuillez saisie l'intitulé");
        Scanner s1 = new Scanner(System.in);
        String intitule = s1.nextLine();
        EnseignantController.AfficherEnseignants();
        System.out.println("Sélectionné un enseignant par id");
        int NouvId = s.nextInt();
        DepartementServices.modifierDepartement(id,intitule, EnseignantServices.getEnseignantById(NouvId));
        AfficherDepartements();
        AfficheMenu();
    }
    public static void SupprimerDepartement(){
        Scanner s = new Scanner(System.in);
        AfficherDepartements();
        System.out.println("sélectionner un id ");
        int id = s.nextInt();
        DepartementServices.deleteDepartement(id);
        AfficherDepartements();
    }
}
