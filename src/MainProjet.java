import java.util.Scanner;

import Models.Departement;
import services.*;
public class MainProjet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix = 0;

        do {
            System.out.println("======= Menu =======");
            System.out.println("1. Gérer les départements");
            System.out.println("2. Gérer les enseignants");
            System.out.println("3. Gérer les filières");
            System.out.println("4. Gérer les modules");
            System.out.println("5. Gérer les étudiants");
            System.out.println("6. Quitter");
            System.out.print("Choisissez une option : ");

            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    departmentMenu(scanner);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez choisir une option valide.");
                    break;
            }
        } while (choix != 6);
    }
    private static void departmentMenu(Scanner scanner) {
        int departmentChoix = 0;

        do {
            System.out.println("======= Menu Départements =======");
            System.out.println("1. Ajouter un nouveau département");
            System.out.println("2. Supprimer un département");
            System.out.println("3. Afficher un département  ");
            System.out.println("4. Retour au menu principal  ");
            System.out.println("Entrez un choix ");
            departmentChoix = scanner.nextInt();
            scanner.nextLine();

            switch (departmentChoix) {
                case 1:
                    System.out.println("Entrez le nom de nouvelle département : ");
                    System.out.println("intitule : ");
                    String intitule = scanner.nextLine();
                    System.out.println("responsable : ");
                    System.out.println("Nom : ");
                    String Nom = scanner.nextLine();
                    System.out.println("Prenom");
                    String prenom = scanner.nextLine();
                    System.out.println("Email");
                    String Email = scanner.nextLine();
                    System.out.println("Grade");
                    String Grade = scanner.nextLine();

                    break;
                case 2:
                    System.out.println("Entrez le nom de département a supprimer : ");
                    System.out.println("intitule : ");
                    String intitule2 = scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Afficher département : ");

                    break;
                case 4:
                    System.out.println("Retour au menu principal...");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez choisir une option valide.");
                    break;
            }
        } while (departmentChoix != 5);
    }
    private static void enseignantMenu(Scanner scanner){
        int enseignant ;
    }

}