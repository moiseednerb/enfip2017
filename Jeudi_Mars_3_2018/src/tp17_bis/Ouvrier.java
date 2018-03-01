package tp17_bis;

public class Ouvrier extends Employe
{
    // Attributs
    private int nbHeures;

    // Constructeurs
    public Ouvrier(String nom, int num, double taux, int ind, int nbHeures)
    {
        super(nom, num, taux, ind);
        this.nbHeures = nbHeures;
    }
}
