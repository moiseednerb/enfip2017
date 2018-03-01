package tp17_bis;

public class Cadre extends Employe

{
    // Attributs
    private double prime;

    // Constructeurs
    public Cadre(String nom, int num, double taux, int ind, double prime)
    {
        super(nom, num, taux, ind);
        this.prime = prime;
    }

    // Méthodes
    public double calcSalaire()
    {
        return super.calcSalaire() + this.prime;
    }
}
