package bdd01;

import  bdd01.Film;

public class Acteur
{
    
    /**
     * LOCAL VARIABLES' DEFINITION
     * 
     */
    private int id;
    private String nom;
    private String prenom;
    private Film objFilm;
    /**
     * 
     *  CONSTRUCTOR AND METHODS
     * 
     */
    public  Acteur(int id, String nom, String prenom){
        
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        
    }
    
    //////////  METHOD 1 //////////////////////////////////////////
    public void ajouteFilm(String film){
        
        objFilm = new Film(film);
    }
    
    
    ////////////  METHOD 2 ///////////////////////////////////////
    @Override
    public String toString(){
        String objActeur =  "";
        
        objActeur = this.nom +" "+this.prenom; //:\n"+objFilm.toString();
        
        return objActeur; 
    }
    

}
