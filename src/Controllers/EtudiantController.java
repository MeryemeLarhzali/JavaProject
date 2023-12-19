package Controllers;
import Models.*;
import services.*;
import java.util.Scanner;

import static services.DepartementServices.departements;
import static services.EtudiantServices.etudiants;
public class EtudiantController {
    public static void AfficheMenu(){
        System.out.println("=======================[ Etudiants ]==============================");


        System.out.println("1: Pour ajouter un étudiant");
        System.out.println("2: Pour afficher les étudiants");
        System.out.println("3: Pour modifier un étudiant");
        System.out.println("4: Pour supprimer un étudiant ");
        System.out.println("0: Pour retourner au menu principal");

        Scanner s = new Scanner(System.in);
        System.out.println("Entrez une option : ");
        int option = s.nextInt();
        switch(option) {
            case 1:
                creerEtudiant();
                break;
            case 2:
                AfficherEtudiants();
                break;
            case 3:
                ModifieEtudiant();
                break;
            case 4:
                SupprimerEtudiant();
                break;
            default:
                main.mainTest.AffichePrincipalMenu();
        }
    }
    public static void AfficherEtudiants(){
        for (Etudiant etudiant : etudiants ) {
            System.out.print("Id : " + etudiant.getId());
            System.out.print("Nom : " + etudiant.getNom());
            System.out.print("Prenom : " + etudiant.getPrenom());
            System.out.print("Email : " + etudiant.getEmail());
            System.out.print("Apogee : " + etudiant.getApogee());
            System.out.print("Filiere : " + etudiant.getFiliere().getIntitule());
            System.out.println("");
        }

    }
    public static void creerEtudiant(){
        Scanner s = new Scanner(System.in);
        System.out.println("Entrez Nom : ");
        String Nom = s.nextLine();
        System.out.println("Entrez Prenom : ");
        Scanner s1 = new Scanner(System.in);
        String Prenom = s1.nextLine();
        System.out.println("Entrez Email : ");
        String Email = s.nextLine();
        System.out.println("Entrez Apogee : ");
        Scanner s2 = new Scanner(System.in);
        int Apogee = s2.nextInt();
        FiliereController.AfficherFilieres();
        System.out.println("Veuillez séléctionner une Filiere par id");
        int id = s.nextInt();
        EtudiantServices.AjoutEtudiant(Nom,Prenom,Email,Apogee,FiliereServices.getFiliereById(id));
        AfficherEtudiants();
        AfficheMenu();
    }
    public static void ModifieEtudiant(){
        Scanner s = new Scanner(System.in);
        AfficherEtudiants();
        // on affiche les étudiants pour que l'utilisateur modifie un etud deja existe
        System.out.println("sélectionner un id ");
        int id = s.nextInt();
        System.out.println("Veuillez saisie le Nom");
        String Nom = s.nextLine();
        System.out.println("Veuillez saisie le Prenom");
        String Prenom = s.nextLine();
        System.out.println("Veuillez saisie l'Email'");
        String Email = s.nextLine();
        System.out.println("Veuillez saisie le Apogee");
        int Apogee = s.nextInt();
        FiliereController.AfficherFilieres();
        System.out.println("Veuillez séléctionner une Filiere par id");
        int NouvId = s.nextInt();
        EtudiantServices.modifierEtudiant(id,Nom,Prenom,Email,Apogee,FiliereServices.getFiliereById(NouvId));
        AfficherEtudiants();
        AfficheMenu();
    }
    public static void SupprimerEtudiant(){
        Scanner s = new Scanner(System.in);
        AfficherEtudiants();
        System.out.println("sélectionner un id ");
        int id = s.nextInt();
        EtudiantServices.supprimerEtudiantById(id);
        AfficherEtudiants();
    }
}
