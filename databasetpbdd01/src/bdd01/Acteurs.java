package bdd01;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import bdd01.Acteur;

public class Acteurs
{

    /**
     *   This class is aiming to manage actors and 
     *   any thing related to them; for instance:
     *      1.  addActor
     *      2.  removeActor
     *      3.  addFilm to an Actor
     *      4.  print a list of movies related to a given actor
     *      5.  and so forth....
     *      
     * 
     */
   
    ///////////// LOCAL VARIABLES' DEFINITION //////////////////////////////////
    private static List <Acteur> objActorCollection = new ArrayList<>(); 
    private static Acteur objActor;
    private static ResultSet dataSet;
    
    public static void init(){
        
         
        dataSet = Loader.loading();
        
        
 
        try
        {
            while(dataSet.next()){
                
                try{
                    ajouteActeur(Integer.parseInt(dataSet.getString("actor_id")),
                    dataSet.getString("first_name"),
                    dataSet.getString("last_name"));
                }
                catch (Error e)
                {
                     /// Action to ...

                }

            }
        }
        catch (NumberFormatException e)
        {
        }
        catch (SQLException e)
        {
        }
    }
    //////////// METHOD 1 //////////////////////////////////////////////////////
//    public static Acteur getActeur(int id){
//        
//        return new Acteur(); //// TEMPORAIRE
//    }
    
    //////////////  METHOD 2 ///////////////////////////////////////////////////
    public static void ajouteActeur(int id, String nom, String prenom){
        
        objActor = new Acteur(id,nom,prenom);
        objActorCollection.add(objActor);
        
    }
    
    ///////////// METHOD 3 ////////////////////////////////////////////////////
    public static void ajouteFilmActeur(int id, String titre){
        
        
    }
    
    ///////////// METHOD 4 ////////////////////////////////////////////////////
    public static void afficheListeActeur(){
        int i;
        Collections.sort(objActorCollection,Collections.reverseOrder());
        for(i=0;i<objActorCollection.size();i++){
            System.out.println(objActorCollection.get(i).toString());
        }
        
    }
    
}
