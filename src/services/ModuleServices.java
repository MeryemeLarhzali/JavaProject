package services;

import Models.*;
import Models.Module;

import java.util.ArrayList;
import java.util.List;

public class ModuleServices {
    public static ArrayList<Module> modules = new ArrayList<Module>();
    static int IdModule=0;
    public  static int getIdModule(){
        IdModule++;
        return IdModule;
    }
    public static Module AjoutModule(String intitule, Enseignant chef, Filiere filiere){
        Module module = new Module();
        module.setIntitule(intitule);
        module.setChef(chef);
        module.setFiliere(filiere);
        module.setId(getIdModule());
        modules.add(module );
        return new Module();
    }
    public static Module modifierModule(int id,String intitule, Enseignant chef, Filiere filiere){
        for(Module module : modules){
            if(module.getId() == id) {
                module.setIntitule(intitule);
                module.setChef(chef);
                module.setFiliere(filiere);
                return module;
            }
        }
        return new Module();
    }
    public static Module getModuleById(int id){
        for(Module module : modules){
            if( module.getId() == id)
                return  module;
        }
        return new Module();
    }
    public static ArrayList<Module>  supprimerModuleById(int id){
        modules.remove(getModuleById(id));
        return  modules ;
    }


}