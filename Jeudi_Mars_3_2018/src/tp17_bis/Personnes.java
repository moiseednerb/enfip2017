package tp17_bis;

import java.util.ArrayList;
import java.util.List;

public class Personnes
{
    private static List<Personne> alPers = new ArrayList<Personne>();

    private Personnes()
    {
        super();
    }

    public static void ajouteCadre(String nom, int num, double taux, int
        indice, double prime)
    {
        alPers.add(new Cadre(nom, num, taux, indice, prime));
    }

    public static void ajouteOuvrier(String nom, int num, double taux, int
        indice, int nbrHeures)
    {
        alPers.add(new Ouvrier(nom, num, taux, indice, nbrHeures));
    }

    public static void liste()
    {
        for (Personne p : alPers)
        {
            System.out.println(p);
        }
    }
    
    /**
     * 
     *  Here is a sigle block aiming to define : 
     *          1. Liste des cadre
     *          2. Liste des  ouvriers
     */
    public static void listeCadreOuvrier(){
        
        for (Personne p: alPers){
            
            if (p instanceof Cadre){
                System.out.println(" Cadre \n" + p);
            }
            if (p instanceof Ouvrier) {
                
                System.out.println(" Ouvrier \n" + p);
            }
        }
    }

}
