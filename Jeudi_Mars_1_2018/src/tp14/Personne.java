package tp14;

public abstract class Personne
{
    private String nom;
    
    /**
     * 
     *  Constructor and Modifiers  
     *  
     */
    
    public  Personne(String nom){
       
        this.nom = nom;
     }
    
    /////////////////////// MODIFIERS /////////////////////////
    
    @Override
    public String toString() {
    	
    	return this.nom;
    }
}
