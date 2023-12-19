package services;

import Models.Departement;
import Models.Enseignant;
import Models.Filiere;

import java.util.ArrayList;
import java.util.List;

public class DepartementServices {
    public static ArrayList<Departement> departements = new ArrayList<Departement>();
    static int IdDepartement =0;
    public  static int getIdDepartement(){
        IdDepartement++;
        return IdDepartement;
    }
public static Departement ajoutDepartement(String intitule, Enseignant Chef) {
        Departement departement = new Departement();
        departement.setIntitule(intitule);
        departement.setChef(Chef);
        departement.setId(getIdDepartement());
        departements.add(departement);// on fait cet appel pour que chaque dep créer il vas incrémenter sinon il vas tjs prend le 0
    return departement;
}
public static Departement modifierDepartement(int id, String intitule,Enseignant Chef){
    for (Departement departement : departements) {
        if (departement.getId() == id) {
            departement.setIntitule(intitule);
            departement.setChef(Chef);
            return departement;
        }
    }

    return  new Departement();
}

    public static Departement getDeptById(int id){
        for (Departement departement : departements) {
            if (departement.getId() == id) return  departement;
        }
        return  new Departement();
    }// on a fait cette methode pour parcourir les departement car on ne peut pas supprimer qlq chose qui n'existe pas
    public static ArrayList<Departement>  supprimerDeptById(int id){
        departements.remove(getDeptById(id));
        return departements ;
    }
}
