package services;

import Models.*;
import Models.Filiere;
import Models.Module;

import java.util.ArrayList;
import java.util.List;

public class FiliereServices {
    public static ArrayList<Filiere> filieres = new ArrayList<Filiere>();
    static int IdFiliere =0;
    public  static int getIdFiliere(){
        IdFiliere++;
        return IdFiliere;
    }

    public static Filiere AjoutFiliere(String intitule, Enseignant chef, Departement dept){
        Filiere filiere = new Filiere();
        filiere.setIntitule(intitule);
        filiere.setChef(chef);
        filiere.setDept(dept);
        filiere.setId(getIdFiliere());
        filieres.add(filiere);
        return new Filiere();
    }
    public static Filiere modifierFiliere(int id,String intitule, Enseignant chef, Departement dept ){
        for(Filiere filiere : filieres ){
            if(filiere.getId() == id){
                filiere.setIntitule(intitule);
                filiere.setChef(chef);
                filiere.setDept(dept);
                return filiere;
            }
        }
        return  new Filiere();
    }

    public static Filiere getFiliereById(int id){// il prens un id et retourne une filiere
        for(Filiere filiere : filieres){
            if( filiere.getId() == id)
                return  filiere;
        }
        return new Filiere();
    }
    public static ArrayList<Filiere>  supprimerFiliereById(int id){
        filieres.remove(getFiliereById(id));
        return filieres ;
    }

}