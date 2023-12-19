package Controllers;
import Models.*;
import Models.Module;
import services.*;
import java.util.Scanner;
import java.util.ArrayList;

import static services.FiliereServices.filieres;
import static services.ModuleServices.modules;

public class ModuleController {
        public static void AfficheMenu(){
            System.out.println("=======================[ Modules ]==============================");


            System.out.println("1: Pour ajouter un module");
            //System.out.println("2: Pour afficher les modules");
            System.out.println("3: Pour modifier un module");
            System.out.println("4: Pour supprimer un module");
            System.out.println("0: Pour retourner au menu principal");

            Scanner s = new Scanner(System.in);
            System.out.println("Entrez une option : ");
            int option = s.nextInt();
            switch(option) {
                case 1:
                    creerModule();
                    break;
                case 2:
                    AfficherModules();
                    break;
                case 3:
                    ModifieModule();
                    break;
                case 4:
                    SupprimerModule();
                    break;
                default:
                    main.mainTest.AffichePrincipalMenu();
            }
        }
    public static void AfficherModules(){
        for (Module module : modules ) {
            System.out.print("Id : " + module.getId());
            System.out.print(" | Intitulé : " + module.getIntitule());
            if (! main.mainTest.isNull(module.getChef())) {
                System.out.print(" | Chef : " + module.getChef().getNom() + " " + module.getChef().getPrenom());
            }
            if (! main.mainTest.isNull(module.getFiliere())) {
                System.out.print(" | Filière : " + module.getFiliere().getIntitule());
            }
            System.out.println("");
        }

    }
    public static void creerModule(){
        Scanner s = new Scanner(System.in);
        System.out.println("Entrez l'intitulé : ");
        String intitule = s.nextLine();
        EnseignantController.AfficherEnseignants();
        System.out.println("Veuillez séléctionner un enseignant par id");
        int id = s.nextInt();
        FiliereController.AfficherFilieres();
        System.out.println("Veuillez séléctionner une Filière par id");
        int id2 = s.nextInt();
        ModuleServices.AjoutModule(intitule,EnseignantServices.getEnseignantById(id),FiliereServices.getFiliereById(id2));
        AfficherModules();
        AfficheMenu();
    }
    public static void ModifieModule(){
        Scanner s = new Scanner(System.in);
        AfficherModules();
        // on affiche les Modules pour que l'utilisateur modifie un module deja existe
        System.out.println("sélectionner un id ");
        int id = s.nextInt();
        System.out.println("Veuillez saisie l'intitulé");
        String intitule = s.nextLine();
        EnseignantController.AfficherEnseignants();
        System.out.println("Sélectionné un enseignant par id");
        int NouvId = s.nextInt();
        FiliereController.AfficherFilieres();
        System.out.println("Veuillez séléctionner une Filière par id");
        int id2 = s.nextInt();
        ModuleServices.modifierModule(id,intitule,EnseignantServices.getEnseignantById(NouvId),FiliereServices.getFiliereById(id2));
        AfficherModules();
        AfficheMenu();
    }
    public static void SupprimerModule(){
        Scanner s = new Scanner(System.in);
        AfficherModules();
        System.out.println("sélectionner un id ");
        int id = s.nextInt();
       ModuleServices.supprimerModuleById(id);
        AfficherModules();
    }
}
