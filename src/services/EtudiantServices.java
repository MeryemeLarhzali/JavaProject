package services;

import Models.Departement;
import Models.Enseignant;
import Models.Etudiant;
import Models.Filiere;

import java.util.ArrayList;

public class EtudiantServices {
    public static ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
    static int IdEtudiant =0;
    public  static int getIdEtudiant(){
        IdEtudiant++;
        return IdEtudiant;
    }

    public static Etudiant AjoutEtudiant(String nom, String prenom, String email, int apogee, Filiere filiere){
        Etudiant etudiant = new Etudiant();
        etudiant.setNom(nom);
        etudiant.setPrenom(prenom);
        etudiant.setEmail(email);
        etudiant.setApogee(apogee);
        etudiant.setFiliere(filiere);
        etudiant.setId(getIdEtudiant());
        etudiants.add(etudiant);
        return  new Etudiant();
    }



    public static Etudiant modifierEtudiant(int id,String nom, String prenom, String email, int apogee, Filiere filiere){
       for(Etudiant etudiant : etudiants ){
           if(etudiant.getId() == id){
               etudiant.setNom(nom);
               etudiant.setPrenom(prenom);
               etudiant.setEmail(email);
               etudiant.setApogee(apogee);
               etudiant.setFiliere(filiere);
               return etudiant;
           }
       }
        return  new Etudiant();
    }
    public static Etudiant getEtudiantById(int id){
        for(Etudiant etudiant : etudiants){
            if( etudiant.getId() == id)
                return  etudiant;
        }
        return new Etudiant();
    }
    public static ArrayList<Etudiant>  supprimerEtudiantById(int id){
        etudiants.remove(getEtudiantById(id));
        return  etudiants ;
    }
}
