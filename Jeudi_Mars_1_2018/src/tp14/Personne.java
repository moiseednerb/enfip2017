package tp14;

public abstract class Personne
{
    private String nom;
    private String prenom;
    private int anneeNaissance;
    
    /**
     * 
     *  Constructor and Modifiers  
     *  
     */
    
    public void Personne(String nom, String prenom, int anneeNaissance){
        
        this.nom = nom;
        this.prenom = prenom;
        this.anneeNaissance = anneeNaissance;
        
    }
    
    /////////////////////// MODIFIERS /////////////////////////
    public Personne getPersonne(){
        
        return this;
    }
    
    ///////////////////////////////////////////////////////////
    public String getNom(){
        
        return this.nom;
    }
    
    ///////////////////////////////////////////////////////////
    public String getPrenom(){

            return this.prenom;
    }
    
    ///////////////////////////////////////////////////////////
     public int getanneeNaissance(){

             return this.anneeNaissance;
     }
}
