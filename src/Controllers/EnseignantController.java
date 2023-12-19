package Controllers;
import Models.*;
import services.*;
import java.util.Scanner;
import java.util.ArrayList;
import static services.EnseignantServices.enseignants;
public class EnseignantController {
    public static void AfficheMenu(){
        System.out.println("=======================[ Enseignants ]==============================");


        System.out.println("1: Pour ajouter un enseignant");
        //System.out.println("2: Pour afficher les enseignants");
        System.out.println("3: Pour modifier un enseignant");
        System.out.println("4: Pour supprimer un enseignant");
        System.out.println("0: Pour retourner au menu principal");

        Scanner s = new Scanner(System.in);
        System.out.println("Entrez une option : ");
        int option = s.nextInt();
        switch(option) {
            case 1:
                creerEnseignant();
                break;
            case 2:
                AfficherEnseignants();
                break;
            case 3:
                ModifieEnseignant();
                break;
            case 4:
                SupprimerEnseignant();
                break;
            default:
                main.mainTest.AffichePrincipalMenu();
        }
    }
    public static void AfficherEnseignants(){
        for (Enseignant enseignant : enseignants) {
            System.out.print("Id : " + enseignant.getId());
            System.out.print(" | Nom : " + enseignant.getNom());
            System.out.print(" | Prenom : " + enseignant.getPrenom());
            System.out.print(" | Email : " + enseignant.getEmail());
            System.out.print(" | Grade : " + enseignant.getGrade());
            if (! main.mainTest.isNull(enseignant.getDept())) {
                System.out.print(" | Departement : " + enseignant.getDept().getIntitule());
            }
            System.out.println("");
        }

    }
    public static void creerEnseignant(){
        Scanner s = new Scanner(System.in);
        System.out.println("Entrez Nom : ");
        String Nom = s.nextLine();
        System.out.println("Entrez Prenom : ");
        String Prenom = s.nextLine();
        System.out.println("Entrez Email : ");
        String Email = s.nextLine();
        System.out.println("Entrez Grade : ");
        String Grade = s.nextLine();
        DepartementController.AfficherDepartements();
        System.out.println("Veuillez séléctionner un Département par id");
        int id = s.nextInt();
        EnseignantServices.AjoutEnseignant(Nom,Prenom,Email,Grade,DepartementServices.getDeptById(id));
        AfficherEnseignants();
        AfficheMenu();
    }
    public static void ModifieEnseignant(){
        AfficherEnseignants();
        Scanner s = new Scanner(System.in);
        // on affiche les enseignants pour que l'utilisateur modifie un anseiganst deja existe
        System.out.println("sélectionner un id ");
        int id = s.nextInt();
        System.out.println("Veuillez saisie le Nom");
        String Nom = s.nextLine();
        System.out.println("Veuillez saisie le Prenom");
        String Prenom = s.nextLine();
        System.out.println("Veuillez saisie l'Email'");
        String Email = s.nextLine();
        System.out.println("Veuillez saisie le Grade");
        String Grade = s.nextLine();
        DepartementController.AfficherDepartements();
        System.out.println("Sélectionné un departement par id");
        int NouvId = s.nextInt();
        EnseignantServices.modifierEnseignant(id,Nom,Prenom,Email,Grade,DepartementServices.getDeptById(NouvId));
        AfficherEnseignants();
        AfficheMenu();
    }
    public static void SupprimerEnseignant(){
        Scanner s = new Scanner(System.in);
        AfficherEnseignants();
        System.out.println("sélectionner un id ");
        int id = s.nextInt();
        EnseignantServices.supprimerEnseignantById(id);
        AfficherEnseignants();
    }
}
