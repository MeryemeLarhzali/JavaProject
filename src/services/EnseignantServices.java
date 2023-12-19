package services;

import Models.Departement;
import Models.Enseignant;

import java.util.ArrayList;

public class EnseignantServices {

    public static ArrayList<Enseignant> enseignants = new ArrayList<Enseignant>();
    static int IdEnseignant =0;
    public  static int getIdEnseignant(){
        IdEnseignant++;
        return IdEnseignant;
    }
    public static Enseignant AjoutEnseignant(String nom, String prenom, String email, String grade, Departement dept){
        Enseignant enseignant = new Enseignant();
        enseignant.setNom(nom);
        enseignant.setPrenom(prenom);
        enseignant.setEmail(email);
        enseignant.setGrade(grade);
        enseignant.setDept(dept);
        enseignant.setId(getIdEnseignant());
        enseignants.add(enseignant);
        return  new Enseignant();
    }

    public static Enseignant modifierEnseignant(int id, String nom, String prenom, String email, String grade, Departement dept){
        for(Enseignant enseignant : enseignants) {
          if(enseignant.getId() == id){
              enseignant.setNom(nom);
              enseignant.setPrenom(prenom);
              enseignant.setEmail(email);
              enseignant.setGrade(grade);
              enseignant.setDept(dept);
              return enseignant;
          }
        }
        return  new Enseignant();
    }
    public static Enseignant getEnseignantById(int id){
        for(Enseignant enseignant : enseignants){
            if(enseignant.getId() == id)
                return enseignant;
        }
        return new Enseignant();
    }
     public static ArrayList<Enseignant>  supprimerEnseignantById(int id){
        enseignants.remove(getEnseignantById(id));
        return enseignants ;
    }
}
